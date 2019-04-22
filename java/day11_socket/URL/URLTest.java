package day11_socket.URL;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Description: URL 、URLConnection
 * @author: daimin
 * @date: Create in 10:18 2019/4/22
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com");
            System.out.println(" 协议 ：" + url.getProtocol() + "\n 主机 ：" + url.getHost() + "\n 资源名：" + url.getFile());

            InputStream in;

            //获取URLConnection对象
            URLConnection urlConn = url.openConnection();
            in = urlConn.getInputStream();
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            System.out.println(new String(bytes, 0, len));

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
