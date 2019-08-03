package com.javaBase;

/**
 * Created by zbb1990 on 2016/11/7.
 */
public class ExceptionTest {

    public static void main(String[] args) {
        try {
            throw new Error("xxxxxxxxxxxxxx");
        }catch (Error error){
            System.out.println(error);
        }
        try {
            throw new Exception("xxxxxxxxxxxxxx");
        }catch (Exception error){
            System.out.println(error);
        }
    }
}
