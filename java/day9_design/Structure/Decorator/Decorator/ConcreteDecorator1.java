package day9_design.Structure.Decorator.Decorator;

import day9_design.Structure.Decorator.Component.Component;

/**
 * @Description: 具体装饰1：实现抽象装饰里的方法，为具体构件扩展功能
 * @author: daimin
 * @date: 2019/4/10
 */
public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component com) {
        super(com);
    }

    @Override
    public void operator() {
        super.operator();
        show();
    }

    /**
     * 新增额外功能
     */
    public void show() {
        System.out.println("1号具体装饰新增的额外功能");
    }
}
