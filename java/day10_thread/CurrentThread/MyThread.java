package day10_thread.CurrentThread;

/**
 * @Description: currentThread、isAlive、sleep、getId、yield
 * @author: daimin
 * @date: Create in 11:52 2019/4/16
 */
public class MyThread extends Thread {
    MyThread() {
        System.out.println("Constructor begin:" + Thread.currentThread().getName());
        System.out.println("This thread : " + this.getName());
        System.out.println("Thread isAlive = " + this.isAlive());
        System.out.println("Constructor end : " + Thread.currentThread().getName() + "\n");
    }

    @Override
    public void run() {
        System.out.println("run begin:" + Thread.currentThread().getName());
        System.out.println("This thread : " + this.getName());
        System.out.println("Thread isAlive = " + this.isAlive());
        System.out.println("run end : " + Thread.currentThread().getName() + "\n");
    }
}
