package day9_design.Create.Prototype;

/**
 * @Description: 原型模式 ：用一个已经创建的实例作为原型，创建一个与原型相同或类似的对象
 * @author: daimin
 * @date: Create in 19:51 2019/4/1
 */
public class Prototype implements Cloneable{

    Prototype(){
        System.out.println("原型类构造函数！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        System.out.println("复制原型类");
        return super.clone();
    }
}
