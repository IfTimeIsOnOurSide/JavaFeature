package day9_design.Structure.Flyweight;

/**
 * @Description: 具体享元角色2：实现抽象享元角色中定义的接口
 * @author: daimin
 * @date: Create in 14:17 2019/4/15
 */
public class ConcreteFlyweight2 implements Flyweight{

    @Override
    public void operation(UnsharableFlyweight outStatus) {
        System.out.println("具体享元角色2实现" + outStatus.getInfo());
    }
}
