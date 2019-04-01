package day9_design.singleton;

/**
 * @Description:
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
