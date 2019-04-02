package day9_design.Create.AbstractFactory.product;

/**
 * @Description: 2号产品对象
 * @author: daimin
 * @date: Create in 18:09 2019/4/2
 */
public class ConcreteProduct2 implements AbstractProduct{

    @Override
    public void show() {
        System.out.println("2号产品对象");
    }
}
