package day10_thread.Priority;

/**
 * @Description: Java中线程的优先级范围 1-10，默认值为5.
 * 优先级较高得线程会被优先执行，如果优先级相同，会采用轮流执行的方式
 * @author: daimin
 * @date: Create in 10:48 2019/4/17
 */
public class PriorityTest {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());

        firstThread.setPriority(1);
        secondThread.setPriority(10);
        firstThread.start();
        secondThread.start();
    }
}
