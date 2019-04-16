package day10_thread.API_Limit;

import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Description: ScheduleExecutorService
 * @author: daimin
 * @date: Create in 18:01 2019/4/4
 */
public class ScheduledTest {
    static ExecutorService service;

    public static void main(String[] args) {

        service = Executors.newScheduledThreadPool(2);
        RunTask task = new RunTask();
        //每秒执行一次
        ((ScheduledExecutorService)service).scheduleAtFixedRate(task, 1, 1, TimeUnit.MILLISECONDS);
        service.shutdown();
    }

    /**
     * task
     */
    static class RunTask extends TimerTask {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("执行任务");
        }
    }
}
