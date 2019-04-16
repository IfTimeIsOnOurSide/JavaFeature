package day10_thread.Interrupt;

/**
 * @Description: interrupt:用来停止线程，
 * 但不是像break语句一样直接跳出当前循环，使线程真的停止，而是打一个停止的标记
 *
 * 1、this.interrupted()：测试当前线程是否已经是中断状态，执行后具有将状态标识清除为 false 的功能。
 * 2、this.islnterrupted()：测试线程 Thread 对象是否已经是中断状态，但不清除状态标识。
 *
 * @author: daimin
 * @date: Create in 14:16 2019/4/16
 */
public class Interrupt {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread thread1 = new Thread(thread);
        thread1.start();
        System.out.println("当前线程中断？" + Thread.interrupted());
        System.out.println("Start 线程中断？name="+ Thread.currentThread().getName() + " ; interrupt =" + Thread.currentThread().isInterrupted());
        System.out.println("Start 线程中断？name="+ thread1.getName() + " ; interrupt =" + thread1.isInterrupted());
        thread1.interrupt();
        System.out.println("End 线程中断？name="+ Thread.currentThread().getName() + " ; interrupt =" + Thread.currentThread().isInterrupted());
        System.out.println("End 线程中断？name="+ thread1.getName() + " ; interrupt =" + thread1.isInterrupted());

    }
}
