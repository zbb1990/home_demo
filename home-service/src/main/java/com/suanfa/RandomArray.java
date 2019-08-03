package com.suanfa;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by zbb1990 on 2016/4/23.
 * 生成一个随机数组，网上的一个面试题
 * url: http://www.cnblogs.com/zuoxiaolong/p/life41.html
 */
public class RandomArray {

    public static int[] random(int length){
        if (length <= 0) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<Integer>(length);
        for (int i = 0; i < length; i++) {
            list.add(i);
        }

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = list.remove(new Random().nextInt(length - i));
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = RandomArray.random(10);
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.print("]");

        System.out.println();
        System.out.println(new Random().nextInt(6));
        System.out.println(new Random().nextInt(4));

        List<String> sourceList = new ArrayList<String>();
        sourceList.add("1");
        sourceList.add("4");
        sourceList.add("3");
        sourceList.add("2");
        sourceList.add("6");
        System.out.println(JSON.toJSON(sourceList));
        //list 顺序重排
        Collections.shuffle(sourceList);
        System.out.println(JSON.toJSON(sourceList));
        System.out.println(sourceList.remove(2));


    }
}
