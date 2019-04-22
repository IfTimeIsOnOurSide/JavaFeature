package day9_design.Action.TemplateMethod;

/**
 * @Description: 抽象类：定义一个算法的轮廓和骨架，由模板方法和若干基本方法组成
 * 1、模板方法：定义算法骨架，按某种顺序调用其包含的基本方法
 * 2、基本方法：
 *     - 抽象方法：抽象类中声明，由具体子类实现
 *     - 具体方法：在抽象类中已经实现，在具体子类中可以继承或重写
 *     - 钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种
 * @author: daimin
 * @date: Create in 17:05 2019/4/22
 */
public abstract class Abstract {

    /**
     * 模板方法
     */
    public void TemplateMethod() {
        //方法执行顺序不同结构不同
        abstractMethod();
        SpecificMethod();
    }

    /**
     * 具体方法
     */
    public void SpecificMethod() {
        System.out.println("在父类中已经实现的具体方法！");
    }

    /**
     * 抽象方法
     */
    abstract void abstractMethod();
}
