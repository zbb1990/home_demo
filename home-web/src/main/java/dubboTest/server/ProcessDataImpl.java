package dubboTest.server;

/**
 * Created by zbb1990 on 2016/6/12.
 */
public class ProcessDataImpl implements IProcessData {
    private String version;
    public String hello(String name) {
        System.out.println(name);
        return "hello : " + name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}
