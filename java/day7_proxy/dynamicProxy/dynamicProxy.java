package day7_proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * @Description: Java Proxy类，可以为传入的参数对象动态生成代理对象，并默认实现原始对象的所有接口
 * @author: daimin
 * @date: Create in 19:57 2019/3/11
 */
public class dynamicProxy implements InvocationHandler {
    /**
     * 委托类对象
     */
    private Object readObject;

    public Object bind(Object obj) {
        this.readObject = obj;
        Object proxy =  Proxy.newProxyInstance(readObject.getClass().getClassLoader(),readObject.getClass().getInterfaces(),this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("在接口具体实现之前惊醒修改");
        Object result = method.invoke(readObject, args);
        System.out.println("接口具体实现之后进行修改");
        return result;
    }
}
