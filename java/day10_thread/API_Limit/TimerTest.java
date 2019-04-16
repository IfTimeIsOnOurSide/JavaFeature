package day10_thread.API_Limit;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description: Timer 定时执行
 * @author: daimin
 * @date: Create in 18:35 2019/4/4
 */
public class TimerTest {
    public static void main(String[] args) {
        RunTask task = new RunTask();
        Timer timer = new Timer();
        timer.schedule(task, 1, 5000);
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
