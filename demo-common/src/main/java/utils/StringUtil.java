package utils;

/**
 * Created by zbb1990 on 2016/9/17.
 */
public class StringUtil {

    public static void main(String[] args) {
        String s1="你好,Java";
        String s2="你好,"+"Java";
        System.out.println(s1==s2);
        System.out.println(s1.intern()==s2.intern());
    }
}
