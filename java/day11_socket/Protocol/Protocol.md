### 网络分类
> 计算机网络是指将多台有独立功能的计算机，通过通信设备线路连接起来， 在网络软件的支持下，实现彼此之前资源共享和数据通信的整个系统

按照地理范围划分网络：
- 局域网（LocalArea Network）LAN:是一种在小范围实现的计算机网络，一个建筑物内或者一个事业单位内部独有；
- 城域网（Metropolitan Area Network）MAN:一个城市内部组建的计算机信息网络，提供全市的信息服务；
- 广域网（Wide Area Network）WAN:范围很广，可以分布在一个省，一个国家或几个国家；
- 因特网（Internet）:由LAN和WAN组成

### 网络编程模型
- Client/Server 
- Browser/Server

### 网络协议
> 网络上所有设备（网络服务器、计算机和交换机、路由器、防火墙）之间通信规则的集合，规定了通信时信息必须采用的格式和这些格式的意义。
##### IP协议
> Internet Protocol(网络之间互联的协议，网协)：为计算机网络相互连接进行通信而设计的协议。

TCP/IP协议：Internet网络中采用TCP/IP（Transmission Control Protocol/Internet Protocol）协议，在全球范围内实现不同硬件结构、不同操作系统、不同网络的互联。

IP地址:网络中每个设备的唯一数字标识，由IPv4协议规定，由4个0-255的数字组成；

TCP VS UDP(传输层协议):
- TCP(Transmission Control Protocol),确保信息一定传递到被接收者；
- UDP(User Datagram Protocol),不保证信息一定传达，但可以向若干目标发送数据以及接收来自若干源的数据；

##### 套接字和端口
- 套接字（Socket）:实现网络通信必须将两台计算机连接起来建立一个双向的通信链路，这条链路的每一端即为一个套接字（Socket）;
- 端口（Port）:一台服务器可能提供多种服务，通常用0-65535的整数来标识服务器上的某个服务，这个整数标识就是端口（Port）;





