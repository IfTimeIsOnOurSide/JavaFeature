package day9_design.Create.Factory.factory;

import day9_design.Create.Factory.product.Product;
import day9_design.Create.Factory.product.ConcreteProduct2;

/**
 * @Description: 2号具体工厂
 * @author: daimin
 * @date: Create in 16:42 2019/4/2
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public Product newProduct() {
        System.out.println("2号具体工厂 -> 只产生2号产品对象");
        return new ConcreteProduct2();
    }
}
