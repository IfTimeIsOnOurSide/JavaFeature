package day9_design.Structure.Adapter.ClassAdapter;

/**
 * @Description: 类适配器
 * @author: daimin
 * @date: Create in 19:56 2019/4/8
 */
public class test {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
