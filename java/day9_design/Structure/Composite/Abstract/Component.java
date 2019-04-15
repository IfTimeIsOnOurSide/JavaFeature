package day9_design.Structure.Composite.Abstract;

/**
 * @Description: 抽象角色：为树叶构建和树枝构建声明公共接口，并实现默认行为。
 * 在透明式的组合模式中抽象构建还声明访问和管理子类的接口；
 * 在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成
 * @author: daimin
 * @date: Create in 14:49 2019/4/15
 */
public interface Component {

    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
    void operation();
}
