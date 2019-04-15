package day9_design.Structure.Composite.Abstract;

/**
 * @Description: 组合模式之透明式组合测试
 * @author: daimin
 * @date: Create in 16:15 2019/4/15
 */
public class CompositeTest {
    public static void main(String[] args) {
        Component component = new Composite();

        Component component0 = new Leaf("树叶1");
        Component component1 = new Leaf("树叶2");
        component.add(component0);
        component.add(component1);

        component.operation();
//        component.getChild(0);
    }
}
