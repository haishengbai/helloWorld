package qycf.hello.world.java.eight.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author v_baihaisheng
 * @create 2021/2/18 8:35 下午
 */
public class JdkProxyMain {

    public static void main(String[] args) {

        Hello hello = new Hello();
        InvocationHandler invocationHandler = new HelloProxy(hello);

        HelloInterface helloInterface = (HelloInterface) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), invocationHandler);
        helloInterface.sayHello();
    }
}
