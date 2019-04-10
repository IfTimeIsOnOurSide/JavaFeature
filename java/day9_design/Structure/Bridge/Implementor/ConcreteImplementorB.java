package day9_design.Structure.Bridge.Implementor;

/**
 * @Description: 具体实现华角色B: 实现化角色接口的B方式的具体实现
 * @author: daimin
 * @date: 2019/4/10
 */
public class ConcreteImplementorB implements Implementor{

    @Override
    public void operateImpl() {
        System.out.println("实现化角色的B实现");
    }
}
