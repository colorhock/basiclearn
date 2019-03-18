package com.learn.demo.iotest;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author daizhiyue
 * @date 2019-03-12 18:12
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\idea\\basiclearn\\basiclearn\\src\\main\\java\\com\\learn\\demo\\iotest\\TestEOF.java")));
        //available的工作方式会随着所读取的媒介类型的不同而有所不同，字面意思就是“在没有阻塞的情况下所能读取的字节数”。
        while (in.available() != 0) {
            System.err.print((char) in.readByte());
        }
    }
}
