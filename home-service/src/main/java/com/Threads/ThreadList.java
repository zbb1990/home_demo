package com.Threads;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zbb1990 on 2017/7/8.
 */
public class ThreadList {

    public static void main(String[] args) throws InterruptedException {
        List<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");
        a.add("c");
        final ArrayList<String> list = new ArrayList<String>(a);
        Thread t = new Thread(new Runnable() {
            int count = -1;

            public void run() {
                while (true) {
                    list.add(count++ + "");
                }
            }
        });
        t.setDaemon(true);
        t.start();
        Thread.currentThread().sleep(3);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
