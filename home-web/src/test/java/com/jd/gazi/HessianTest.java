package com.jd.gazi;

import com.caucho.hessian.client.HessianProxyFactory;
import com.javaNet.IGreetingService;

/**
 * Created by zbb1990 on 2016/6/15.
 */
public class HessianTest {

    public static void main(String[] args) throws Exception {
        //RPC访问地址
        String url = "http://localhost:80/hessian";

        //接口的动态代理工厂
        HessianProxyFactory factory = new HessianProxyFactory();
        IGreetingService greetingService = (IGreetingService) factory.create(IGreetingService.class, url);

        //远程方法调用
        System.out.println("hello(), " + greetingService.greeting("tom"));
    }
}
