package day9_design.Structure.Adapter.ClassAdapter;

/**
 * @Description: 适配器类：转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户安目标接口的格式访问适配者
 * @author: daimin
 * @date: Create in 19:41 2019/4/8
 */
public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void request(){
        specificRequest();
    }

}
