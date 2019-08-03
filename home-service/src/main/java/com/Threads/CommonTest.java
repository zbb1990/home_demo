package com.Threads;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zbb1990 on 2017/7/9.
 */
public class CommonTest {

    public static void main(String[] args) {
        List aa = new ArrayList();
        System.out.println("空list hashcode:" + aa.hashCode());
        aa.add(1);
        System.out.println("list 1 hashcode:" + aa.hashCode());
        aa.add(2);
        System.out.println("list 2 hashcode:" + aa.hashCode());
    }
}
