package com.learn.demo.iotest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author daizhiyue
 * @date 2019-03-12 18:15
 */
public class BufferedInputFile {

    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s=in.readLine())!=null) {
            sb.append(s+"\n");
        }
        in.close();
        return  sb.toString();
    }

    public static void main(String[] args) throws  IOException{
        System.out.println(read("D:\\idea\\basiclearn\\basiclearn\\src\\main\\java\\com\\learn\\demo\\iotest\\BufferedInputFile.java"));

    }
}
