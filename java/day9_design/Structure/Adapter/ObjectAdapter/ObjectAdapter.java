package day9_design.Structure.Adapter.ObjectAdapter;

/**
 * @Description: 适配器
 * @author: daimin
 * @date: Create in 20:03 2019/4/8
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;

    ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
