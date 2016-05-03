package com.jd.gazi;

import junit.framework.TestCase;
import org.junit.Test;

import java.net.InetAddress;

/**
 * Created by zbb1990 on 2016/4/23.
 * 注意 junit @Test 注解是4.0版本后才引入的！！！
 *
 */
public class BaseJunitTest_1 extends TestCase{

    @Test
    public void testInetAddress() throws Exception{
        InetAddress address =  InetAddress.getByName("www.baidu.com");
        System.out.println(address);
        System.out.println(address.getHostAddress());

        InetAddress addressLocal =  InetAddress.getLocalHost();
        System.out.println(addressLocal);
        System.out.println("0000");
    }



}
