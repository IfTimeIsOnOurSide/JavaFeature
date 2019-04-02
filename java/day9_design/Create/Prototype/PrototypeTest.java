package day9_design.Create.Prototype;

/**
 * @Description:
 * @author: daimin
 * @date: Create in 20:07 2019/4/1
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Prototype proto = new Prototype();
        Prototype proto1 = (Prototype) proto.clone();

        System.out.println(proto == proto1);
    }
}
