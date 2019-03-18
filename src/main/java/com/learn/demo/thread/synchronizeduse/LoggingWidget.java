package com.learn.demo.thread.synchronizeduse;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  验证synchronized关键字可重入
 * @author daizhiyue
 * @date 2019-03-05 15:14
 */
public class LoggingWidget extends Widget {

    public synchronized void doSomething() {
        System.out.println("LoggingWidget doSomething...");
        super.doSomething();
    }

    public static void main(String[] args) {
        LoggingWidget loggingWidget = new LoggingWidget();
        loggingWidget.doSomething();
        Hashtable<String, String> ht = new Hashtable<String, String>();
        HashMap<String, String> hashMap = new HashMap();
        List<String> list = new ArrayList<String>();
        LinkedList linkedList = new LinkedList();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ReentrantLock reentrantLock = new ReentrantLock(true);
        reentrantLock.lock();
        reentrantLock.unlock();
    }

}
