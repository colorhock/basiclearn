package com.learn.demo.iotest.channels;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 *  内存映射文件允许我们创建和修改哪些因为太大而不能放入内存的文件。有了内存映射文件，我们就可以假定整个文件都在内存中，而且完全把它当做非常大的数组来访问。
 *  这种方式极大地简化了用于修改文件的代码。
 * @author daizhiyue
 * @date 2019-03-15 18:09
 */
public class LargeMappedFiles {
    static int length = 0x8FFFFFF; //128MB

    public static void main(String[] args) throws IOException {
        MappedByteBuffer out = new RandomAccessFile("test.dat", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i < length; i++) {
            out.put((byte) 'x');
        }
        System.out.println("Finished writing");
        for (int i = length / 2; i < length / 2 + 6; i++) {
            System.out.print((char) out.get(i));
        }


    }
}
