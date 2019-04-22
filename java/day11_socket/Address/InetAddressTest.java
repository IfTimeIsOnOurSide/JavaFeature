package day11_web.Address;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

/**
 * @Description: InetAddress 操作域名和IP
 * @author: daimin
 * @date: Create in 14:51 2019/4/17
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress a0 = InetAddress.getByName("www.baidu.com");
            System.out.println("Address = " + a0.getAddress() + "\nHostName(域名) = " + a0.getHostName() + "\nHostAddress(IP) = " + a0.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
