package com.learn.demo.iotest.channels;

import java.nio.ByteBuffer;

/**
 * @author daizhiyue
 * @date 2019-03-15 10:50
 */
public class GetData {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);

        int i = 0;
        while (i++ < bb.limit()) {
            if(bb.get() != 0) {

            }

        }
    }
}
