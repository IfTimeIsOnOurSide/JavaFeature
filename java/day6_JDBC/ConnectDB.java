package day6_JDBC;

import java.sql.*;

/**
 * @Description:  Java 连接数据库的步骤
 * @author: daimin
 * @date: Create in 22:50 2019/3/6
 */
public class ConnectDB {

    /**
     *  你要知道你要连哪个数据库吧？所以 url
     */
    public static String url = "jdbc:mysql://localhost:3306/bbs?useSSL=FALSE&serverTimezone=Asia/Shanghai";

    /**
     * 数据驱动
     */
    public static String driver = "com.mysql.cj.jdbc.Driver";

    /**
     * 用户名 和 密码
     */
    public static String root = "root";
    public static String pwd = "000000";

    public static void main(String[] args) {

        /**
         *   1、加载驱动
         *   2、创建连接对象
         *   3、创建语句
         *   4、接收结果集
         *   5、关闭资源
         */
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, root, pwd);
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery("select * from fatie ");

            System.out.println(result.getRow());
          /*  while(result.next()) {
                result.getObject(0);
                System.out.println(result.getObject(0));
            }*/
            //关闭
            result.close();
            state.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException f) {
            f.printStackTrace();
        }
    }
}
