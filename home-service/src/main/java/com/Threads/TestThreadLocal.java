package com.Threads;

import java.util.Random;

/**
 * Created by zbb1990 on 2016/6/5.
 */

class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class TestThreadLocal implements Runnable{

    ThreadLocal studentLocal = new ThreadLocal();

    private static final ThreadLocal<Integer> value = new ThreadLocal<Integer>(){
      /*  @Override
        protected Integer initialValue() {
            return Integer.valueOf(1);
        }*/
    };

    public static void main(String[] args) throws Exception{
        new Thread(new Runnable() {
            public void run() {
                System.out.println("多线程获取" + value.get());
            }
        }).start();

//        Thread.sleep(5000l);
        System.out.println(value.get());
        System.out.println(value);
        TestThreadLocal t = new TestThreadLocal();
        new Thread(t, "t1").start();
        new Thread(t, "t2").start();
    }

    public void run() {
        accessStudent();
    }

    private void accessStudent() {
        Student s = this.getStudent();
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("current thread set age " + Thread.currentThread()
                + ":" + age);
        s.setAge(age);
        System.out.println("current thread first get age "
                + Thread.currentThread() + ":" + s.getAge());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("current thread second get age "
                + Thread.currentThread() + ":" + s.getAge());
    }

    public Student getStudent() {
        Student s = (Student) studentLocal.get();
        if (s == null) {
            s = new Student();
            studentLocal.set(s);
        }
        return s;
    }


}
