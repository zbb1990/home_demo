package com.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Created by zbb1990 on 2017/9/10.
 */
@Service
public class TestHystrixJavanica {

    @HystrixCommand(groupKey="ExampleGroup", commandKey = "HelloWorld",
            threadPoolKey="HelloWorldPool", fallbackMethod = "defaultHello")
    public String getUserById(String name) {
        Integer num = null;
        System.out.println( num == 1);
        return "hello world";
    }

    private String defaultHello(String name) {
        return "Hello Failure " + name + "!";
    }
}
