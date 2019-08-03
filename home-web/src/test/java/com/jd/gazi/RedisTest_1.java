package com.jd.gazi;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;
import utils.RedisClient;
import utils.RedisUtil;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by zbb1990 on 2016/5/15.
 */
public class RedisTest_1 {

    String testRedisListPrefix = "redis_list_";

    @Test
    public void testRedisSet(){
        RedisClient.set("zbb", "ypm");
        System.out.println("test redis set success");

        Jedis jedis = RedisUtil.getJedis();
        jedis.set("zbb", "ypmFromPool");

        Transaction tx = jedis.multi();
        tx.exec();

        jedis.pipelined();

    }

    /**
     * 测试redis zset 排序队列是否支持多线程并发
     */
    @Test
    public void testRedisZsetSort() throws InterruptedException {
        final String zsetKey = "test6";
        //调度型线程池
        ExecutorService threadPool = Executors.newCachedThreadPool();
        final Random random = new Random();
        for(int i=1;i<=100;i++){
            final int task = i;
            threadPool.execute(new Runnable(){
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName());
                        Jedis jedis = RedisUtil.getJedis();
                        for (int j = 0; j < 10; j++) {
                            //Thread.sleep(100);
                            //jedis.zadd(zsetKey,Math.random(),"sorts_" + random.nextInt(1000));
                            jedis.incr("incrKey");
                        }
                        RedisUtil.returnResource(jedis);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            });
        }

        System.out.println("all of 100 tasks has committed");
//        threadPool.shutdown();
        Thread.sleep(10000);

    }

    @Test
    public void testRedisSort(){
        Random random = new Random();
        Jedis jedis = RedisUtil.getJedis();
        for (int i = 0; i < 20; i++) {
            String randomNo = "123456" + String.format("4%d", random.nextInt(1000));
            System.out.println("放入随机订单号" + randomNo);
            jedis.lpush(testRedisListPrefix + "20160607", randomNo);
        }

        List<String> results =  jedis.lrange(testRedisListPrefix + "20160607", 0, 5);
        System.out.println("从redis取出的值=========");
        for (String temp : results){
            System.out.println(temp);
        }
    }


}
