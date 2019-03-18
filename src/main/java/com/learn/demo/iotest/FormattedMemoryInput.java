package com.learn.demo.iotest;

import java.io.*;

/**
 * @author daizhiyue
 * @date 2019-03-12 18:12
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("D:\\idea\\basiclearn\\basiclearn\\src\\main\\java\\com\\learn\\demo\\iotest\\FormattedMemoryInput.java").getBytes()));
            while (true) {
                System.err.print((char)in.readByte());
            }
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
