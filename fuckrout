package com.learn.demo.iotest.channels;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * @author daizhiyue
 * @date 2019-03-14 18:02
 */
public class TransferTo {
    public static void main(String[] args) throws IOException {
        if(args.length != 2) {
            System.out.println("arguments:sourcefile destfile");
            System.exit(1);

        }
        FileChannel in = new FileInputStream(args[0]).getChannel();
        FileChannel out = new FileOutputStream(args[1]).getChannel();
//        in.transferTo(0, in.size(), out);
        out.transferFrom(in, 0, in.size());
    }
}
