## TCP网络程序
> 利用Socket编写的通信程序。利用TCP协议进行通信的两个应用程序是由主次之分的。
一个服务器程序（ServerSocket类表示服务器端），一个客户端程序（Socket类表示Socket客户端）

### 交互流程
1. 服务器端创建一个ServerSocket(服务器端套接字)，调用accept()方法等待客户端 来请求；
2. 客户端程序创建一个Socket,请求与服务器建立连接；
3. 服务器接收客户的连接请求，同时创建一个新的Socket与客户建立连接，服务器继续等待新的请求；