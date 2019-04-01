package day9_design.singleton;

/**
 * @Description: 饿汉式单例 ： 在类创建的同事已经创建好一个静态的对象供系统使用
 * @author: daimin
 * @date: Create in 19:28 2019/4/1
 */
public class HungrySingleton {

    //私有构造
    private HungrySingleton() {}

    //私有成员属性
    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        System.out.println("这也是同一个实例！（饿汉式）");
        return instance;
    }
}
