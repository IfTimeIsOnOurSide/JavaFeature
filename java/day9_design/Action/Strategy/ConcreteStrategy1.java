package day9_design.Action.Strategy;

/**
 * @Description: 具体策略类：实现抽象策略类的抽象方法，提供具体算法实现
 * @author: daimin
 * @date: Create in 19:03 2019/4/22
 */
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("算法具体实现1");
    }
}
