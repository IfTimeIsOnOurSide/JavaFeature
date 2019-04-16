package day10_thread.SafeThread.Synchronized;

/**
 * @Description: 同步块测试
 * @author: daimin
 * @date: Create in 11:34 2019/4/16
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        Thread thread1 = new Thread(thread, "A");
        Thread thread2 = new Thread(thread, "B");
        Thread thread3 = new Thread(thread, "C");
        Thread thread4 = new Thread(thread, "D");
        Thread thread5 = new Thread(thread, "E");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
