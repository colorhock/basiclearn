package com.learn.demo.iotest.FilterInputStream;

import java.io.*;

/**
 * @author daizhiyue
 * @date 2019-03-13 17:38
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws Exception {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
        out.writeDouble(3.14159);
        out.writeUTF("That was pi");
        out.writeDouble(1.654646);
        out.writeUTF("sdfklajl ");
        out.flush();
        out.close();
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        in.close();

    }
}
