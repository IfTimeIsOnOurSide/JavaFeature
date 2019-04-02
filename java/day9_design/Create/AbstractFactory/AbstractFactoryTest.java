package day9_design.Create.AbstractFactory;

import day9_design.Create.AbstractFactory.factory.ConcreteFactory1;

/**
 * @Description: 抽象工厂方法 ：为访问类提供一个创建一组相关或相互依赖对象的接口，访问类无须指定所要产品具体类
 * @author: daimin
 * @date: Create in 17:43 2019/4/2
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        factory1.newProduct1().show();
        factory1.newProduct2().show();
    }
}
