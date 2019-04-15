package day9_design.Structure.Composite.Abstract;

/**
 * @Description: 树叶构件：组合中的叶节点对象，没有子节点，用于实现抽象构件中声明的公共接口
 * @author: daimin
 * @date: Create in 14:53 2019/4/15
 */
public class Leaf implements Component{
    private String name;

    Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {}
    @Override
    public void remove(Component c) {}
    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶构件"+ name + "中实现抽象构件的方法");
    }
}
