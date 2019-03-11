package day7_proxy.staticProxy;

/**
 * @Description:  代理类
 * @author: daimin
 * @date: Create in 19:17 2019/3/11
 */
public class staticProxy implements AFunc{
    public AFuncImpl aFuncImpl;
    public staticProxy(AFuncImpl aFuncImpl) {
        this.aFuncImpl = aFuncImpl;
    }

    @Override
    public void doA() {
        System.out.println("在接口声明方法具体实现之前进行的操作！");
        aFuncImpl.doA();
    }
}
