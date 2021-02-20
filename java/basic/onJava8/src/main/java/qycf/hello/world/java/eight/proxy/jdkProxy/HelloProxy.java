package qycf.hello.world.java.eight.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author v_baihaisheng
 * @create 2021/2/18 8:33 下午
 */
public class HelloProxy implements InvocationHandler {

    private Object subject;

    public HelloProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke : " + method.getName());
        method.invoke(subject, args);
        System.out.println("after invoke : " + method.getName());
        return 0;
    }
}
