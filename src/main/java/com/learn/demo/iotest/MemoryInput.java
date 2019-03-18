package com.learn.demo.iotest;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author daizhiyue
 * @date 2019-03-12 18:12
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {

        StringReader in = new StringReader(BufferedInputFile.read("D:\\idea\\basiclearn\\basiclearn\\src\\main\\java\\com\\learn\\demo\\iotest\\MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
