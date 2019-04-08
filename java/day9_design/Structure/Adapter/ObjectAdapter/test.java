package day9_design.Structure.Adapter.ObjectAdapter;

/**
 * @Description: 对象适配器测试
 * @author: daimin
 * @date: Create in 20:05 2019/4/8
 */
public class test {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
