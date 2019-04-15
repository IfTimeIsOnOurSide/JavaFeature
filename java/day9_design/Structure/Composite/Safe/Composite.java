package day9_design.Structure.Composite.Safe;

import java.util.ArrayList;

/**
 * @Description: 安全式树枝构件
 * @author: daimin
 * @date: Create in 16:25 2019/4/15
 */
public class Composite implements Component{
    private ArrayList<Component> children = new ArrayList<>();

    public void add(Component c) {
        children.add(c);
    }
    public void remove(Component c) {
        children.remove(c);
    }
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
