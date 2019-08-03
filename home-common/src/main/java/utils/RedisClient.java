package utils;

import redis.clients.jedis.Jedis;

/**
 * Created by zbb1990 on 2016/5/15.
 * redis的相关操作均放在这个类里面
 */
public class RedisClient {

    private static Jedis jedis;

    static {
        //连接redis服务器，127.0.0.1:6379
        jedis = new Jedis("127.0.0.1",6379);
        //权限认证
//        jedis.auth("");
        System.out.println("jedis connect success!!!");
    }

    public static void set(String key,String value){
        if(null != jedis){
            jedis.set(key,value);

        }
    }

    public static Long zadd(String zsetKey, double number, String value){
        if(null != jedis){
            jedis.zadd(zsetKey,number,value);
        }
        return null;
    }
}
