package day10_thread.Interrupt;

/**
 * @Description:
 * @author: daimin
 * @date: Create in 13:58 2019/4/16
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("线程开始时间：" + startTime);
        int count = 0;
        for (int i = 0; i < 500000; i++) {
            count++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("线程结束时间：" +  endTime);
        System.out.println("总共耗时：" + (endTime - startTime));
    }
}
