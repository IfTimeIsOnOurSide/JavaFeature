package day10_thread.SafeThread.LoginCheck;

/**
 * @Description:
 * @author: daimin
 * @date: Create in 11:02 2019/4/16
 */
public class LoginThread implements Runnable {
    private String name;
    private String pwd;
    LoginThread(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public void run() {
        LoginCheck.check(name, pwd);
    }
}
