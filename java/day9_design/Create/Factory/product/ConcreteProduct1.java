package day9_design.Create.Factory.product;

/**
 * @Description: 1号产品
 * @author: daimin
 * @date: Create in 16:47 2019/4/2
 */
public class ConcreteProduct1 implements Product {

    @Override
    public void show() {
        System.out.println("1号产品对象");
    }
}
