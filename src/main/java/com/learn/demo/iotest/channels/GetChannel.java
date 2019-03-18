package com.learn.demo.iotest.channels;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * +
 * 旧I/O类库中有三个类被修改了，用以缠上FileChannel.这三个被修改的类是FileInputStream,
 * FileOutputStream以及用于既读又写的RandomAccessFile.
 *
 * @author daizhiyue
 * @date 2019-03-14 15:57
 */
public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        FileChannel fc = new FileOutputStream("data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some txt ".getBytes()));
        fc.close();
        fc = new RandomAccessFile("data.txt", "rw").getChannel();
        fc.position(fc.size());  //move to the end
        fc.write(ByteBuffer.wrap("Some more".getBytes()));  //wrap方法将已存在的字节数组“包装”到ByteBuffer中。
        fc.close();

        fc = new FileInputStream("data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while (buff.hasRemaining()) {
            System.out.print((char) buff.get());
        }


    }
}
