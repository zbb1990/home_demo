package utils;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zbb1990 on 2016/9/10.
 */
public class JsonUtil {

    public static void main(String[] args) {
        Map<String,String> paramMap = new HashMap<String, String>();
        paramMap.put("name","ypm");
        paramMap.put("age","12");
        System.out.println(JSON.toJSONString(paramMap));
    }
}
