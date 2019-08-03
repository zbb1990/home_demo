package com.javaNet;

import java.io.IOException;

/**
 * Created by zbb1990 on 2016/6/15.
 * hessian test interface
 */
public interface IGreetingService {

    public String greeting(String name) throws IOException;
}
