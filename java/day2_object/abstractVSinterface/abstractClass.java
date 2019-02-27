package day2_object.abstractVSinterface;

/**
 * @Description: 抽象类定义： 有自己的属性和fun
 *                              fun可以内部实现
 *                              abstract声明的fun必须被子类实现，当然，子类如果不是抽象类的话，手动微笑
 *
 * @author: daimin
 * @date: Create in 14:46 2019/2/27
 */
public abstract class abstractClass {
    private String name;

    public void setName (String name) {
        this.name = name;
    }
    public void getName () {
        System.out.println("Name of abstract  class : " + name);
    }


    public abstract void move();
}
