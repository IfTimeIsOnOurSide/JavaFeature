package day9_design.Create.Factory;

import day9_design.Create.Factory.factory.ConcreteFactory1;
import day9_design.Create.Factory.factory.ConcreteFactory2;

/**
 * @Description: 工厂模式 ： 一个创建对象的接口，将对象的实际创建放在具体的工厂类的子类中 （创建和使用相分离）
 *
 * 工厂模式结构： 1、抽象工厂 ：提供创建产品的接口
 *                2、具体工厂 ： 实现抽象工厂中的抽象方法，完成具体对象的创建
 *                3、抽象对象 ： 定义对象规范，描述对象主要特性和功能
 *                4、具体对象 ： 实现抽象对象定义的接口， 由具体工厂创建，与具体工厂一一对应
 * @author: daimin
 * @date: Create in 16:27 2019/4/2
 */
public class FactoryTest {

    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        factory1.newProduct().show();

        ConcreteFactory2 factory2 = new ConcreteFactory2();
        factory2.newProduct();
    }
}
