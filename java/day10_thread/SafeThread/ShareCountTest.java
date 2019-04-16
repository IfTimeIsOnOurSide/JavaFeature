package day10_thread.SafeThread;

/**
 * @Description: 共享变量测试
 * @author: daimin
 * @date: Create in 9:41 2019/4/16
 */
public class ShareCountTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        Thread thread1 = new Thread(thread, "A");
        Thread thread2 = new Thread(thread, "B");
        Thread thread3 = new Thread(thread, "C");
        Thread thread4 = new Thread(thread, "D");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
