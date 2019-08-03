package com.Threads;

import com.log.LogService;

import javax.annotation.Resource;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zbb1990 on 2016/7/4.
 */
public class CountDownLatchTest implements Runnable{

    @Resource
    private LogService logService;

    static final CountDownLatch end = new CountDownLatch(10);
    static final CountDownLatchTest demo = new CountDownLatchTest();

    public void run() {
        try {
            Thread.sleep(new Random().nextInt(10)*1000);
            System.out.println(Thread.currentThread().getName() + "complete...");
            end.countDown();
        }catch(Exception e){

        }
    }

    public static void main(String[] args) throws Exception{
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            exec.submit(demo);
        }
        end.await();
        System.out.println("fire...");
        exec.shutdown();
    }

}
