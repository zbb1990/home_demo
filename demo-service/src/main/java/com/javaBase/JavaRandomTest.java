package com.javaBase;

import java.util.Random;

/**
 * Created by zbb1990 on 2016/5/11.
 */
public class JavaRandomTest {

    public static void main(String[] args){
        Random random = new Random();

        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < 60; i++) {
            if(random.nextInt(3) == 0){
                num0 ++ ;
            }
            if(random.nextInt(3) == 1){
                num1 ++ ;
            }
            if(random.nextInt(3) == 2){
                num2 ++ ;
            }
        }
        System.out.println("0 num = " + num0);
        System.out.println("1 num = " + num1);
        System.out.println("2 num = " + num2);

        System.out.println(random.nextInt(3));
    }
}
