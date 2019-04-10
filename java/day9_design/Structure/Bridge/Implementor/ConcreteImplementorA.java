package day9_design.Structure.Bridge.Implementor;

/**
 * @Description: 具体实现华角色A: 实现化角色接口的A方式的具体实现
 * @author: daimin
 * @date: 2019/4/10
 */
public class ConcreteImplementorA implements Implementor{

    @Override
    public void operateImpl() {
        System.out.println("实现化角色的A实现");
    }
}
