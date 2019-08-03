package javaSerial;

import com.caucho.hessian.io.HessianOutput;
import com.caucho.hessian.io.HessianSerializerInput;
import com.caucho.hessian.io.HessianSerializerOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by zbb1990 on 2016/6/14.
 * hessian序列化
 * <p/>
 * 序列化是指将一个对象序列化成字节流,便于存储或者网络传输;
 * 而反序列化恰好相反,将字节流,变回一个对象.我们平常用的比较多的是hessian序列化方式和java序列化方式,
 * 两种序列化方式的效率,以及序列化大小是不一样的,从测试结果看,hessian好一点
 */
public class HessianSerial {

    /**
     * 纯hessian序列化
     *
     * @param object
     * @return
     * @throws Exception
     */

    public static byte[] serialize(Object object) throws Exception {
        if (object == null) {
            throw new NullPointerException();
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        HessianOutput hessianOutput = new HessianOutput(os);
//        HessianSerializerOutput
        hessianOutput.writeObject(object);
        return os.toByteArray();
    }

    /**
     * 纯hessian反序列化
     *
     * @param bytes
     * @return
     * @throws Exception
     */

    public static Object deserialize(byte[] bytes) throws Exception {
        if (bytes == null) {
            throw new NullPointerException();
        }
        ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        HessianSerializerInput hessianInput = new HessianSerializerInput(is);
        Object object = hessianInput.readObject();
        return object;
    }
}
