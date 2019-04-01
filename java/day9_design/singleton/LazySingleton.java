package day9_design.singleton;

/**
 * @Description: 单例模式 ：懒汉式单例
 * 1、一个类只能生成一个实例
 * 2、单例对象必须由单例类自行创建
 * 3、提供一个对外的访问该单例的全局的访问点
 * @author: daimin
 * @date: Create in 17:47 2019/3/29
 */
public class LazySingleton {

    //私有构造函数
    private LazySingleton() {}

    //实例成员
    public static volatile LazySingleton instance = null;

    /**
     * 保证instance在所有线程中同步，但是每次访问都要同步会消耗更多的资源，从而影响性能
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
            System.out.println("这是一个实例！(懒汉式)");
        }
        return instance;
    }
}
