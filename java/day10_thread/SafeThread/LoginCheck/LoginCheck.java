package day10_thread.SafeThread.LoginCheck;

/**
 * @Description: 用户登录验证
 * @author: daimin
 * @date: Create in 10:44 2019/4/16
 */
public class LoginCheck {
    private static String username;
    private static String password;

    synchronized public static void check(String name, String pwd) {
        username = name;
        password = pwd;
        System.out.println("userName : " + username + ", password : " + password);
    }
}
