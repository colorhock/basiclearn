package com.learn.demo.iotest.OSExecute;

/**
 * @author daizhiyue
 * @date 2019-03-14 14:32
 */
public class OSExecuteDemo {
    public static void main(String[] args) {
        System.out.println(OSExecute.class.getResource("").getPath());
        OSExecute.command("javap /idea/basiclearn/basiclearn/target/classes/com/learn/demo/iotest/OSExecute/OSExecuteDemo");
    }
}
