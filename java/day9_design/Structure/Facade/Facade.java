package day9_design.Structure.Facade;

/**
 * @Description: 外观角色：为多个子系统提供一个共同的对外的接口
 * @author: daimin
 * @date: 2019/4/11
 */
public class Facade {

    private SubSystem1 system1 = new SubSystem1();
    private SubSystem2 system2 = new SubSystem2();


    public void show() {
        System.out.println("外观角色提供的统一的接口");

        system1.show1();
        system2.show2();
    }
}
