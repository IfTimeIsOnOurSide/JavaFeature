package day9_design.Structure.Flyweight;

/**
 * @Description: 抽象享元角色：所有具体享元类的基类，为具体享元规范需要实现的公共接口，
 * 非享元类的外部状态以参数的形式通过方法传入
 * @author: daimin
 * @date: Create in 14:13 2019/4/15
 */
public interface Flyweight {

    void operation(UnsharableFlyweight outStatus);
}
