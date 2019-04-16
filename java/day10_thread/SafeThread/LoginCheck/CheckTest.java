package day10_thread.SafeThread.LoginCheck;

/**
 * @Description: 多用户验证
 * @author: daimin
 * @date: Create in 11:06 2019/4/16
 */
public class CheckTest {
    public static void main(String[] args) {
        LoginThread user0 = new LoginThread("admin", "admin");
        LoginThread user1 = new LoginThread("root", "root");

        new Thread(user0).start();
        new Thread(user1).start();
    }
}
