package day11_socket.Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketAddress;

/**
 * @Description: 服务端Socket接口，通过accept()接口与客户端建立通信连接
 *
 * 如果多台客户端同事提出连接请求，服务器套接字会将请求连接的客户端存入队列中，
 * 然后从中取出一个套接字与服务器新建的套接字连接起来。
 * 若请求连接大于最大容纳数，则多出的连接请求被拒绝，默认队列大小是50.
 * @author: daimin
 * @date: Create in 19:20 2019/4/18
 */
public class ServerSocketClazz {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            //监听并接收请求连接
            serverSocket.accept();
            //将ServerSocket绑定到指定地址（IP地址和端口号）
            serverSocket.bind(new SocketAddress() { });
            //关闭连接
            serverSocket.close();
            //返回当前服务器套接字的本地地址
            serverSocket.getInetAddress();
            //返回当前套接字监听的端口
            serverSocket.getLocalPort();
            //返回当前套接字绑定的端口的地址
            serverSocket.getLocalSocketAddress();
            //获取SO_RCVBUF选项的值，该值是从ServerSocket接收的套接字的建议缓冲区大小
            serverSocket.getReceiveBufferSize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
