package day9_design.Structure.Flyweight;

import java.util.HashMap;

/**
 * @Description: 享元工厂：负责创建和管理享元角色
 * @author: daimin
 * @date: Create in 14:24 2019/4/15
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("享元角色" + key + "已存在");
        } else {
            flyweight = new ConcreteFlyweight1(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
