package day9_design.Create.Factory.factory;

import day9_design.Create.Factory.product.Product;

/**
 * @Description: 抽象工厂
 * @author: daimin
 * @date: Create in 16:37 2019/4/2
 */
public interface AbstractFactory {
    /**
     * 创建对象的接口方法
     */
    Product newProduct();
}
