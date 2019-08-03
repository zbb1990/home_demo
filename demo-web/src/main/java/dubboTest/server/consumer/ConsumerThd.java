package dubboTest.server.consumer;

import dubboTest.server.IProcessData;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zbb1990 on 2016/6/12.
 */
public class ConsumerThd {
    public void sayHello(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                new String[] {"spring/applicationConsumer.xml"});
        context.start();
        IProcessData demoService=(IProcessData) context.getBean("processDataService");
        System.out.println(demoService.hello("world"));
    }
}
