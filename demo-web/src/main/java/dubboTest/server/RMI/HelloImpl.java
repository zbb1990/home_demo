package dubboTest.server.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by zbb1990 on 2016/6/13.
 */
public class HelloImpl extends UnicastRemoteObject implements IHello  {

    private static final long serialVersionUID = 9167909631768965700L;

    /**
     * 因为UnicastRemoteObject的构造方法抛出了RemoteException异常，因此这里默认的构造方法必须写，必须声明抛出RemoteException异常
     *
     * @throws RemoteException
     */
    public HelloImpl() throws RemoteException {
    }

    /**
     * 简单的返回“Hello World！"字样
     *
     * @return 返回“Hello World！"字样
     * @throws java.rmi.RemoteException
     */
    public String helloWorld() throws RemoteException {
        return "Hello World!";
    }

    /**
     * 一个简单的业务方法，根据传入的人名返回相应的问候语
     *
     * @param someBodyName 人名
     * @return 返回相应的问候语
     * @throws java.rmi.RemoteException
     */
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException {
        return "你好，" + someBodyName + "!";
    }
}
