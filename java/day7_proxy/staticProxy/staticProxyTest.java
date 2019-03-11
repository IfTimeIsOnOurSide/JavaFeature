package day7_proxy.staticProxy;

/**
 * @Description: 静态代理：接口、接口实现类（委托类）、代理类
 *
 *                 优点：不必修改委托类，不影响其他使用者的调用 （使用者与委托类解耦）
 *                 缺点：必须提前知道委托类，委托类实现多个接口时，代理类需要不停的修改
 * @author: daimin
 * @date: Create in 19:38 2019/3/11
 */
public class staticProxyTest {
    public static void main(String[] args) {
        staticProxy staticProxy = new staticProxy(new AFuncImpl());

        staticProxy.doA();
    }
}
