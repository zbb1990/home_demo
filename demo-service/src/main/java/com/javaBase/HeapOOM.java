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
        List<OOMObject> list = new ArrayList<OOMObject>();


        while(true){
            list.add(new OOMObject());
        }
    }
}
