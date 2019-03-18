package com.learn.demo.iotest.channels;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author daizhiyue
 * @date 2019-03-14 17:55
 */
public class ChannelCopy {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("arguments:sourcefile destfile");
            System.exit(1);  // system.exit(1):是非正常退出，就是说无论程序正在执行与否，都退出
        }
        FileChannel in = new FileInputStream(args[0]).getChannel();
        FileChannel out = new FileOutputStream(args[1]).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while (in.read(buffer) != -1) {
            buffer.flip();   //prepare for writing
            out.write(buffer);
            buffer.clear(); //prepare for reading
        }


    }
}
