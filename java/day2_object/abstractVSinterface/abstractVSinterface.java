package day2_object.abstractVSinterface;

/**
 * @Description: 抽象类 VS 接口
 * @author: daimin
 * @date: Create in 14:15 2019/2/27
 */
public class abstractVSinterface {
    public static void main(String[] args) {
        getExample();
    }

    /**
    * 抽象类 VS 接口
     * 定义 ： 抽象类是类， 有属性和方法的class , 抽象类的fun可以没有abstract修饰 ， 但是包含有abstract修饰的方法的class一定是抽象类
     *        因为需要呗实现；
     *        接口就不能称之为类了，因为它里面只有方法啊，类可以实现多个接口，却只能继承一个父类，也就是变相多态啦！
     * 注意：抽象类 和 接口 都是不能实例化的，当然是因为有未实现的fun啦！
     */
    public static void getExample() {
        exampleClass example = new exampleClass();
        example.setName("daimin");
        example.getName();
        example.move();
        example.getLog();
    }
}
