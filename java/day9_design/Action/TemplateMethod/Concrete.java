package day9_design.Action.TemplateMethod;

/**
 * @Description: 具体子类：实现父类中的抽象方法和钩子方法
 * @author: daimin
 * @date: Create in 17:12 2019/4/22
 */
public class Concrete extends Abstract{

    @Override
    public void abstractMethod() {
        System.out.println("实现父类中的抽象方法");
    }
}
