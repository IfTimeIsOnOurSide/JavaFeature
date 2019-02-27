package day2_object;

/**
 * @Description: 子类 实例
 * @author: daimin
 * @date: Create in 16:46 2019/2/26
 */
public class cat extends animal{
    cat() {
        System.out.println("Contructor of sun!");
        super.name();
        this.name();
    }

    @Override
    public void name() {
        System.out.println("Fun of Sun override Fun of Father!");
    }
}
