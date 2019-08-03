package com.javaBase;

import java.io.File;

/**
 * Created by zbb1990 on 2016/12/16.
 */
public class FileTest {
    public static void main(String[] args) throws InterruptedException {
        File f = new File("W:\\test.txt");
        f.delete();
        Thread.currentThread().sleep(40000l);
    }
}
