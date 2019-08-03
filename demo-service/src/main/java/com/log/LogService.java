package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

/**
 * Created by zbb1990 on 2016/7/7.
 */
@Component("logService")
public class LogService {

    static Logger logger = LoggerFactory.getLogger(LogService.class);

    public static void main(String[] args) throws Exception{
        logger.debug("my first log debug");
        logger.info("my first log info");
        logger.error("my first log error");

        int i  = new Integer(2).intValue();

        DecimalFormat df1 = new DecimalFormat("####.00");
        logger.info(df1.format(123.4223d));
        logger.info(df1.format(123.3d));



        logger.info(Integer.valueOf("22").equals("22") + "");

        System.out.println("adasafa".split("a"));

        System.out.println(splitStr("fefwegwfegwgwgwegwegwegsf", 'f'));
        System.out.println("dasdafkfwbfbwbwbvvwbiwb".indexOf('d'));
        System.out.println(searchCharInStr("dasdafkfwbfbwbwbvvwbiwb", 'b'));

//        Thread.currentThread().sleep(1000000000l);
    }


    public static int searchCharInStr(String value,char i){
        int count = 0;
        value.toCharArray();
        String[] ii = value.split(i + "");
        count = ii.length - 1;

        return count;
    }

    public static String splitStr(String value,char a){
        String result = "";



/*        int firstIndex = value.indexOf(a);

        int secondIndex = value.substring(firstIndex + 1).indexOf(a);

        int thirdIndex = value.substring(secondIndex + 1).indexOf(a);*/

        return value.split(a + "")[2];
        /*if(value.indexOf(a) == 0){
            return value.split(a + "")[1];

        }else{
            return value.split(a + "")[2];
        }*/
    }

}
