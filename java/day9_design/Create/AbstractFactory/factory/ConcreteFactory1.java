package day9_design.Create.AbstractFactory.factory;

import day9_design.Create.AbstractFactory.product.AbstractProduct;
import day9_design.Create.AbstractFactory.product.ConcreteProduct1;
import day9_design.Create.AbstractFactory.product.ConcreteProduct2;

/**
 * @Description: 1号具体工厂
 * @author: daimin
 * @date: Create in 18:05 2019/4/2
 */
public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public AbstractProduct newProduct1() {
        System.out.println("1号工厂");
        return new ConcreteProduct1();
    }

    @Override
    public AbstractProduct newProduct2() {
        System.out.println("1号工厂");
        return new ConcreteProduct2();
    }
}
