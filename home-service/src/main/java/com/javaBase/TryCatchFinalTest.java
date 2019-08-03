package com.javaBase;

/**
 * Created by zbb1990 on 2016/12/4.
 */
public class TryCatchFinalTest {

    @SuppressWarnings("finally")
    public static final String test() {
        String t = "";

        try {
            t = "try";
            Integer.parseInt(null);
            return t;
        } catch (Exception e) {
            t = "catch";
            Integer.parseInt(null);
            return t;
        } finally {
            t = "finally";
    //            return t;
        }
    }

    public static void main(String[] args) {
        System.out.print(TryCatchFinalTest.test());
    }
}
