package day9_design.Create.AbstractFactory.factory;


import day9_design.Create.AbstractFactory.product.AbstractProduct;

/**
 * @Description: 抽象工厂
 * @author: daimin
 * @date: Create in 18:00 2019/4/2
 */
public interface AbstractFactory {

    AbstractProduct newProduct1();

    AbstractProduct newProduct2();
}
