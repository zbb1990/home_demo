package com.javaBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zbb1990 on 2016/5/1.
 */
public class HeapOOM {
    static class OOMObject{}

    /**
     * @param args
     */
    public static void main(String[] args) {

        Object oo = new Object();
        List<OOMObject> list = new ArrayList<OOMObject>();

        while(true){
            try {
                Thread.sleep(1000);
                String a = new String("abc");
                String b = new String("bbb");
                String c = new String("ccc");
                String d = new String("ddd");
                list.add(new OOMObject());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
