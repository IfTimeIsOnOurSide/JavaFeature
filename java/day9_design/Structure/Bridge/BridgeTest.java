package day9_design.Structure.Bridge;

import day9_design.Structure.Bridge.Abstract.Abstraction;
import day9_design.Structure.Bridge.Abstract.RefinedAbstraction;
import day9_design.Structure.Bridge.Implementor.ConcreteImplementorA;
import day9_design.Structure.Bridge.Implementor.Implementor;

/**
 * @Description: 桥接模式
 * @author: daimin
 * @date: 2019/4/10
 */
public class BridgeTest {
    public static void main(String[] args) {

        Implementor implA = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implA);
        abstraction.operator();

    }
}
