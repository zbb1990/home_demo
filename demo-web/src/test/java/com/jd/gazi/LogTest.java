package com.jd.gazi;

import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zbb1990 on 2016/7/7.
 */
public class LogTest extends TestCase {

    Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void testLog(){
        logger.debug("my first log debug");
        logger.info("my first log info");
        logger.error("my first log error");
    }


    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.println("use transaction_"+i+";");
            for (int j = 0; j < 20; j++) {
                System.out.println("update client_financial_income_everyday_"+j+" set logic_income_date = income_date\n" +
                        "where logic_income_date is null;");
            }
            System.out.println();
        }

    }

}
