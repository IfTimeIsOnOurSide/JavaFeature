package day11_web.Socket;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @Description: 客户端Socket:用于呼叫远端机器上的一个端口，主动向远程服务器端发送数据（连接建立以后能接收数据）
 * @author: daimin
 * @date: Create in 20:16 2019/4/18
 */
public class SocketClazz {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            //将当前套接字绑定到本机地址
            socket.bind(new SocketAddress() {});
            //连接服务器端
            socket.connect(new SocketAddress() {});
            //返回套接字连接地址
            socket.getInetAddress();
            //返回本地绑定地址
            socket.getLocalAddress();
            //输入/输出流
            socket.getInputStream();
            socket.getOutputStream();
            //返回绑定的端口地址
            socket.getLocalSocketAddress();
            //返回连接的远程端口地址
            socket.getRemoteSocketAddress();
            //返回本地端口/远程端口
            socket.getPort();
            socket.getLocalPort();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
