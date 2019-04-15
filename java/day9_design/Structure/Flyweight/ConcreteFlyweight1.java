package day9_design.Structure.Flyweight;

/**
 * @Description: 具体享元角色1：实现抽象享元角色中定义的接口
 * @author: daimin
 * @date: Create in 14:16 2019/4/15
 */
public class ConcreteFlyweight1 implements Flyweight{
    private String key;
    ConcreteFlyweight1(String key) {
        this.key = key;
    }

    @Override
    public void operation(UnsharableFlyweight outStatus) {
        System.out.println("具体享元角色1实现" + outStatus.getInfo());
    }
}
