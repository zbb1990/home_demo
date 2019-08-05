package com.javaBase;

/**
 * Created by zbb1990 on 2019/8/6.
 */
public class InnerClassTest {

    public void test (Product p){
        System.out.println(p.getName()+"--------"+p.getPrice());
    }

    public static void main(String [ ] args )
    {
        InnerClassTest as= new InnerClassTest ();
        as.test(new Product()//此处实现接口并实现抽象方法
        {
            public double getPrice()//实现方法
            {
                return 8888;
            }

            public String getName()//实现方法
            {
                return "I can do it ";
            }

        });
    }
}
