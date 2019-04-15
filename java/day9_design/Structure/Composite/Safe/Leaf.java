package day9_design.Structure.Composite.Safe;

/**
 * @Description: 安全式树叶构件：实现抽象构件方法
 * @author: daimin
 * @date: Create in 16:22 2019/4/15
 */
public class Leaf implements Component {
    private String name;

    Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树叶构件‘"+ name +"' 实现抽象构件中的方法");
    }
}
