package day10_thread.Yield;

/**
 * @Description: yield 测试
 * @author: daimin
 * @date: Create in 14:04 2019/4/16
 */
public class YieldTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread thread1 = new Thread(thread);
        thread1.start();
    }
}
