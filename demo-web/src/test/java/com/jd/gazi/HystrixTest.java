package com.jd.gazi;

import com.hystrix.TestHystrixJavanica;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zbb1990 on 2017/9/10.
 */
public class HystrixTest extends TestCase {
    @Autowired
    private TestHystrixJavanica testHystrixJavanica;

    @Test
    public void testHystrixJavanica(){
        for (int i=0;i<30;i++){
            System.out.println(i + "------------------------------->>>");
            try {
                String userById = testHystrixJavanica.getUserById("zbb1990");
                System.out.println(userById);
            }catch (Exception x){

            }
        }
    }
}
