package day7_proxy.dynamicProxy;

/**
 * @Description: 动态代理  中介类（实现InvocationHandler接口，根据传入的对象自动生成代理类）
 * @author: daimin
 * @date: Create in 20:17 2019/3/11
 */
public class test {
    public static void main(String[] args) {
        dynamicProxy proxy = new dynamicProxy();
        BFunc bFunc = (BFunc) proxy.bind(new BFuncImpl());
        bFunc.doB();
    }
}
