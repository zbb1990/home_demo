package com.Threads;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by zbb1990 on 2017/5/9.
 */
public class CountDownTest2 {

    private static CountDownLatch latch = new CountDownLatch(3);


    public static void main(String[] args) throws InterruptedException{
        List<String> resultList = new ArrayList<String>();
        long timeStart = System.currentTimeMillis();
        new Thread(){
            public void run(){
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("1线程执行完了");
                latch.countDown();
            };
        }.start();

        new Thread(){
            public void run(){
                try {
                    Thread.currentThread().sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("2线程执行完了");
                latch.countDown();
            };
        }.start();

        new Thread(){
            public void run(){
                try {
                    Thread.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("3线程执行完了");
                latch.countDown();
            };
        }.start();

        new Thread(new InnerThreadClss(resultList)).start();
        System.out.println("4线程执行完了" + JSON.toJSONString(resultList));

        latch.await();
        System.out.println("ok------------耗时:" + (System.currentTimeMillis() - timeStart) + "毫秒");
    }



}

class InnerThreadClss implements Runnable{
    List<String> resultList = new ArrayList<String>();

    public InnerThreadClss(){

    }
    public InnerThreadClss(List<String> resultList){
        this.resultList = resultList;
    }

    public void run() {
        resultList.add("123");
    }
}
