package day9_design.Structure.Decorator;

import day9_design.Structure.Decorator.Component.Component;
import day9_design.Structure.Decorator.Component.ConcreteComponent;
import day9_design.Structure.Decorator.Decorator.ConcreteDecorator1;
import day9_design.Structure.Decorator.Decorator.Decorator;

/**
 * @Description: 装饰器模式
 * @author: daimin
 * @date: 2019/4/10
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator1(component);
        decorator.operator();
    }
}
