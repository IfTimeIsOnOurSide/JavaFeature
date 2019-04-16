package day10_thread.SafeThread.Synchronized;

/**
 * @Description:
 * @author: daimin
 * @date: Create in 11:33 2019/4/16
 */
public class MyThread implements Runnable {
    private int count = 5;

    @Override
    public void run() {
        synchronized(this) {
            System.out.println(Thread.currentThread().getName() + " : count = " + count--);
        }
    }
}
