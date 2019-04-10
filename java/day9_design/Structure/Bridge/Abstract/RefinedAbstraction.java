package day9_design.Structure.Bridge.Abstract;

import day9_design.Structure.Bridge.Abstract.Abstraction;
import day9_design.Structure.Bridge.Implementor.Implementor;

/**
 * @Description: 抽象化角色的子类，实现父类中的业务方法（抽象方法），并通过组合关系调用实现化角色中的业务方法（接口）
 * @author: daimin
 * @date: 2019/4/10
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    @Override
    public void operator() {
        System.out.println("扩展抽象化角色中实现抽象化角色中的方法");
        super.implementor.operateImpl();
    }
}
