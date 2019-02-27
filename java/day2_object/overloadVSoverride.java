package day2_object;

/**
 * @Description: 重载 和 重写
 * @author: daimin
 * @date: Create in 11:16 2019/2/27
 */
public class overloadVSoverride {
    public static void main(String[] args) {

        System.out.println("overload : ");
        overloadExam();
        overloadExam("daimin");

        System.out.println("\noverride : ");
        overrideExam();
    }

    /**
    *  overload 对战 override
     *  override : 重写 ， 发生在父类和子类中，比如线程中的run()方法，如果你创建一个线程不实现你自己的run方法，那你的线程将毫无意义
     *  overload : 重载 ，发生在一个类中，比如构造，你懂的！
     *
     *  作用 ： 重写 是对父类的扩充，继承父类并增加自己的功能
     *          重载 类似功能的方法可以有相同的方法名，通过入参不同选择需要功能
     */
    public static void overrideExam() {
        Runnable run = () -> System.out.println("This is my Thread!");
        new Thread(run).start();
    }

    public static void overloadExam() {
        System.out.println("This fun will be overloaded!");
    }

    public static void overloadExam(String name) {
        System.out.println("overload from overloadExam with parameter :" + name);
    }
}
