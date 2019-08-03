package javaSerial;

/**
 * Created by zbb1990 on 2016/6/14.
 * 序列化单元测试
 */
public class SerialTest {

    public static void main(String[] args) throws Exception{
        String serialTemp = "aaaaaa1212121313aaadadasdqdqwfef2f3";
        System.out.println(JavaSerial.serialize(serialTemp).length);
        System.out.println(HessianSerial.serialize(serialTemp).length);
    }
}
