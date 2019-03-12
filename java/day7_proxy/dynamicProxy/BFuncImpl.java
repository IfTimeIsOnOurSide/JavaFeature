package day7_proxy.dynamicProxy;

/**
 * @Description: 接口实现类
 * @author: daimin
 * @date: Create in 19:56 2019/3/11
 */
public class BFuncImpl implements BFunc{
    @Override
    public void doB() {
        System.out.println("doB()方法的具体实现！");
    }
}
