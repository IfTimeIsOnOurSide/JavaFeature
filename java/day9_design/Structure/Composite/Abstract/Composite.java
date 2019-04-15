package day9_design.Structure.Composite.Abstract;

import java.util.ArrayList;

/**
 * @Description: 树枝构件：组合中的分支节点对象，有子节点。
 * 实现抽象构件中声明的接口，主要作用存储和管理子部件
 * @author: daimin
 * @date: Create in 14:54 2019/4/15
 */
public class Composite implements Component{
    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        children.add(c);
    }
    @Override
    public void remove(Component c) {
        children.remove(c);
    }
    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        System.out.println("树枝构件中实现抽象构件的方法");
        for (Object obj : children) {
            ((Component)obj).operation();
        }
    }
}
