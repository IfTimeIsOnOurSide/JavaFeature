package day10_thread.Priority;

/**
 * @Description:
 * @author: daimin
 * @date: Create in 10:45 2019/4/17
 */
public class FirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("FirstThread线程run方法被调用！");
        for (int i = 0; i < 5; i++) {
            System.out.println("FirstThread : i = " + i);
        }
    }
}
