package day10_thread.Yield;

/**
 * @Description: yield ：使当前线程放弃CPU资源，让其他任务去执行，但是放弃的时间不确定
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
            Thread.yield();
            count++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("线程结束时间：" +  endTime);
        System.out.println("总共耗时：" + (endTime - startTime));
    }
}
