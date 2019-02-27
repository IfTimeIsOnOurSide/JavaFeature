package day2_object.abstractVSinterface;

/**
 * @Description: 实例 继承抽象类 实现接口 （有血有肉有名字）
 * @author: daimin
 * @date: Create in 14:56 2019/2/27
 */
public class exampleClass extends abstractClass implements interfaceExam{

    private String type;

    /**
    * 抽象类中的抽象方法，你不override一下，声明它干嘛呢？
     */
    @Override
    public void move() {
        System.out.println("I relized it from abstract class!");
    }

    /**
    * 接口中只有方法声明，当然需要你来实现一下啦！
     */
    @Override
    public void getLog() {
        System.out.println("I relized it from interface!");
    }
}
