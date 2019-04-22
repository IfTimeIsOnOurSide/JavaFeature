package day9_design.Action.TemplateMethod;

/**
 * @Description: 模板方法测试
 * @author: daimin
 * @date: Create in 17:23 2019/4/22
 */
public class TemplateTest {
    public static void main(String[] args) {
        Abstract clazz = new Concrete();
        clazz.TemplateMethod();
    }
}
