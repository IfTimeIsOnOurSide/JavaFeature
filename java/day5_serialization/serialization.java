package day5_serialization;

import java.io.Serializable;

/**
 * @Description:  想知道一个类可不可以序列化吗？ 那就看它有没有实现 Serialization 接口
 * @author: daimin
 * @date: Create in 14:06 2019/2/28
 */
public class serialization implements Serializable {

    private String name;
    private String type;
    private transient String color;
    private int age;

    serialization (String name, String type, String color, int age) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.age = age;
    }

    public void getName () {
        System.out.println("Name : " + name);
    }
   /* public void getType () {
        System.out.println("Type : " + type);
    }
    public void getColor () {
        System.out.println("color : " + color);
    }
    public void getAge () {
        System.out.println("Age : " + age);
    }*/
}
