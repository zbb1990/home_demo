package dubboTest.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zbb1990 on 2016/6/12.
 * http://dubbo.io/User+Guide-zh.htm
 * dubbo 用户指南
 */
public class TestDubboService {

    @Autowired
    private IProcessData processDataService;

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                new String[] {
                        "spring/applicationProvider.xml"
                });
        context.start();
        System.out.println("按任意键退出");
        System.in.read();
    }
}
