package qycf.hello.world.java.eight.proxy.cglibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {


    /**
     * obj：cglib生成的代理对象
     * method：被代理对象方法
     * objects：方法入参
     * methodProxy: 代理方法
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("======插入前置通知======");
        Object object = proxy.invokeSuper(obj, args);
        System.out.println("======插入后者通知======");
        return object;
    }
}
