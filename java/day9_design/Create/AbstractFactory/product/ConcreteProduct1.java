package day9_design.Create.AbstractFactory.product;

/**
 * @Description: 1号产品对象
 * @author: daimin
 * @date: Create in 18:08 2019/4/2
 */
public class ConcreteProduct1 implements AbstractProduct{

    @Override
    public void show() {
        System.out.println("1号产品对象");
    }
}
