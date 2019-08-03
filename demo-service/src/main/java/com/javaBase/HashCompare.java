package com.javaBase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zbb1990 on 2016/5/9.
 * 比较java中hashmap hashtable ConcurrentHashMap等区别
 */
public class HashCompare {

    public static void main(String[] args){
        System.out.println("test hash");

        try{
            Hashtable hashtable = new Hashtable();
            hashtable.put(null, null);
            hashtable.containsKey("aa");
        }catch(Exception e){
            System.out.println("Hashtable put null exception" + e);
        }

        HashMap hashMap = new HashMap();
        hashMap.put(null,null);
        Map mm = Collections.synchronizedMap(hashMap);

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

        int h = 0;
        if (0 != h && "aa" instanceof String) {
//            System.out.println(sun.misc.Hashing.stringHash32("aa"));
        }

        h ^= "aa".hashCode();

        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        System.out.println(h ^ (h >>> 7) ^ (h >>> 4));
    }
}
