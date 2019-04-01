package day9_design.singleton;

/**
 * @Description: 懒汉式因为锁因此同步的时候消耗资源比较多，而且线程安全需要volatile synchronized保证，因此通常用饿汉式单例
 * @author: daimin
 * @date: Create in 19:37 2019/4/1
 */
public class singleton {
    public static void main(String[] args) {
        LazySingleton lazy0 = LazySingleton.getInstance();
        LazySingleton lazy1 = LazySingleton.getInstance();

        //线程安全
        HungrySingleton hungry0 = HungrySingleton.getInstance();
        HungrySingleton hungry1 = HungrySingleton.getInstance();
    }
}
