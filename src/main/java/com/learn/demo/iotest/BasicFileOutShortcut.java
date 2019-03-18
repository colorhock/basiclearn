package com.learn.demo.iotest;

import java.io.*;

/**
 * @author daizhiyue
 * @date 2019-03-13 15:24
 */
public class BasicFileOutShortcut {

    static String file = "BasicFileOutShortcut.out";

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new StringReader(
                BufferedInputFile.read("D:\\idea\\basiclearn\\basiclearn\\src\\main\\java\\com\\learn\\demo\\iotest\\BasicFileOutShortcut.java")
        ));
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s=in.readLine()) != null) {
            out.println(lineCount++ + ":" +s);
        }
        out.flush();
        out.close();
        System.out.println(BufferedInputFile.read(file));

    }
}
