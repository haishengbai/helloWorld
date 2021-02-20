package qycf.hello.world.java.eight.proxy.jdkProxy;

/**
 * @Author v_baihaisheng
 * @create 2021/2/18 8:32 下午
 */
public class Hello implements HelloInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello Proxy");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("GoodBye Proxy");
    }

    @Override
    public int count() {
        return 0;
    }
}
