package day9_design.Structure.Adapter.ClassAdapter;

/**
 * @Description: 适配者类：被访问和适配的现存组件库中的组件接口
 * @author: daimin
 * @date: Create in 19:40 2019/4/8
 */
public class Adaptee {
    /**
     * 适配者中的方法
     */
    public void specificRequest() {
        System.out.println("适配者中的方法");
    }
}
