package com.xhystrix;

/**
 * Created by zbb1990 on 2017/9/10.
 */
public class TestMain {

    public static void main(String[] args) {
        TestHystrixJavanica testHystrixJavanica = new TestHystrixJavanica();
        for (int i=0;i<30;i++){
            System.out.println(i + "------------------------------->>>");
            try {
                String userById = testHystrixJavanica.getUserById("zbb1990");
                System.out.println(userById);
            }catch (Exception x){

            }
            System.out.println("hahha");
        }
    }
}
