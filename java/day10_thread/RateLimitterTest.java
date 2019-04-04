package day10_thread;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.CountDownLatch;

/**
 * @Description: RateLimiter 控制访问频率
 * @author: daimin
 * @date: Create in 17:00 2019/4/4
 */
public class RateLimitterTest {

    public static void main(String[] args) throws InterruptedException{
        //每秒最多允许2次请求
        RateLimiter limitter = RateLimiter.create(2);
        CountDownLatch latch = new CountDownLatch(1);

        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable(){
                @Override
                public void run() {
                    try {
                        latch.await();
                        //超过频率阻塞线程
                        limitter.acquire();
                        System.out.println("线程执行中。。。。");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        System.out.println("超过请求限制后等待1s");
        Thread.sleep(1000);
        latch.countDown();
    }
}
