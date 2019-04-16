package day10_thread.SafeThread;

/**
 * @Description: 继承Thread类
 * @author: daimin
 * @date: Create in 19:49 2019/4/15
 */
public class MyThread extends Thread{
    private int totalCount = 5;

   /* @Override
    public void run() {
        super.run();
        totalCount--;
        System.out.println(Thread.currentThread().getName() + "操作 ：count = " + totalCount);
    }*/

   @Override
    synchronized public void run() {
       super.run();
       totalCount--;
       System.out.println(Thread.currentThread().getName() + "操作 ：count = " + totalCount);
   }
}
