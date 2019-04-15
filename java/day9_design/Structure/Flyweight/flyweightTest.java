package day9_design.Structure.Flyweight;

/**
 * @Description: 享元模式测试
 * @author: daimin
 * @date: Create in 14:32 2019/4/15
 */
public class flyweightTest {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight0 = factory.getFlyweight("a");
        Flyweight flyweight1 = factory.getFlyweight("b");
        Flyweight flyweight2 = factory.getFlyweight("a");

        flyweight0.operation(new UnsharableFlyweight("a的外部状态"));
        flyweight1.operation(new UnsharableFlyweight("b的外部状态"));
        flyweight2.operation(new UnsharableFlyweight("a第二次被调用的外部状态"));
    }
}
