package com.learn.demo.thread.synchronizeduse;

import java.util.Hashtable;

/**
 * @author daizhiyue
 * @date 2019-03-05 15:14
 */
public class Widget {
    public synchronized void doSomething() {

        System.out.println("Widget doSomething...");
    }
}
