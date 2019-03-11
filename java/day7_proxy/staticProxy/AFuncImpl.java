package day7_proxy.staticProxy;

/**
 * @Description: 接口实现类
 * @author: daimin
 * @date: Create in 19:31 2019/3/11
 */
public class AFuncImpl implements AFunc{

    /**
     * 复写接口父类的声明方法
     */
    @Override
    public void doA() {
        System.out.println("doA()的具体实现！");
    }
}
