package com.javaNet;

import java.io.IOException;

/**
 * Created by zbb1990 on 2016/6/15.
 * hessian service 实现类
 */
public class GreetingService implements IGreetingService {

    public String greeting(String name) throws IOException {
        return "Welcome ot the Hassian world, " + name;
    }
}
