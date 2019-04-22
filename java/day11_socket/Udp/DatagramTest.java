package day11_socket.Udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Description: UDP: User Datagram Protocol 数据包（无连接）通信
 * @author: daimin
 * @date: Create in 17:51 2019/4/19
 */
public class DatagramTest {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        DatagramPacket dp = null;

        int port = 8083;
        try {
            ds = new DatagramSocket(port);
            byte[] b = new byte[1024];
            while(!ds.isClosed()) {
                dp = new DatagramPacket(b, b.length);
                try {
                    //发送和接收
                    ds.send(dp);
                    ds.receive(dp);
                    byte[] data = dp.getData();
                    int len = data.length;

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
