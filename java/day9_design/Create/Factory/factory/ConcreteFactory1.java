package day9_design.Create.Factory.factory;

import day9_design.Create.Factory.product.Product;
import day9_design.Create.Factory.product.ConcreteProduct1;

/**
 * @Description: 1号具体工厂 ： 实现抽象工厂的方法
 * @author: daimin
 * @date: Create in 16:40 2019/4/2
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public Product newProduct() {
        System.out.println("1号具体工厂 -> 只产生1号产品对象");
        return new ConcreteProduct1();
    }
}
