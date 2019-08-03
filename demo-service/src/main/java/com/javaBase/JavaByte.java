package com.javaBase;

/**
 * Created by zbb1990 on 2016/6/9.
 * 学习下java 字节相关的知识
 */
public class JavaByte {

    public static void main(String args[]) throws Exception{
        int i = 'C';
        System.out.println(i);

        System.out.println("学java".getBytes("UTF-8").length);

        String hello = "hello world";
        byte[] bytes = hello.getBytes();
        System.out.println(bytes);

    }
}
