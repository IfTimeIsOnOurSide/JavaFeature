package day9_design.Structure.Composite.Safe;

/**
 * @Description: 安全式构件测试
 * @author: daimin
 * @date: Create in 16:28 2019/4/15
 */
public class SafeTest {
    public static void main(String[] args) {
        Component component = new Composite();

        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        ((Composite) component).add(leaf1);
        ((Composite) component).add(leaf2);

        component.operation();
    }
}
