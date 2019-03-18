package com.learn.demo.iotest;

import java.io.PrintWriter;

/**
 * @author daizhiyue
 * @date 2019-03-14 11:33
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello World");
    }
}
