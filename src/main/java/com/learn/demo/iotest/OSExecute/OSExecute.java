package com.learn.demo.iotest.OSExecute;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author daizhiyue
 * @date 2019-03-14 14:13
 */
public class OSExecute {
    public static void command(String command) {
        boolean err = false;
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader results = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String s;
            while ((s = results.readLine()) != null) {
                System.out.println(s);
            }
            BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((s = errors.readLine()) != null) {
                System.err.println(s);
                err = true;
            }

        } catch (Exception e) {
            if (!command.startsWith("CMD /d")) {
                command("CMD /d " + command);
            } else {
                throw  new RuntimeException(e);
            }
        }
        if(err) {
            throw new OSExecuteException("Errors executing " + command);
        }
    }
}
