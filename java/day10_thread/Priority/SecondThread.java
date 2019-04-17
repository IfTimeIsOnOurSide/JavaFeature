package day10_thread.Priority;

/**
 * @Description:
 * @author: daimin
 * @date: Create in 10:47 2019/4/17
 */
public class SecondThread implements Runnable {

    @Override
    public void run() {
        System.out.println("SecondThread线程中run方法被调用！");
        for (int i = 0; i < 5; i++) {
            System.out.println("SecondThread : i = " + i);
        }
    }
}
