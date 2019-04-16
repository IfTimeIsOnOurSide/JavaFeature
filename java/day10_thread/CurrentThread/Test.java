package day10_thread.CurrentThread;

/**
 * @Description: currentThread、isAlive、sleep、getId
 * @author: daimin
 * @date: Create in 11:53 2019/4/16
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            System.out.println("主线程唯一标识 ：" + Thread.currentThread().getId());
            System.out.println("main begin : " + thread.isAlive() + "\n");
            thread.start();
            System.out.println("MyThread 标识 ：" + thread.getId());
            Thread.sleep(1000);
            System.out.println("main end : " + thread.isAlive() + "\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
