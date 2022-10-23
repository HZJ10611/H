package SocketTest01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//定义接口9999
		ServerSocket serverSocket = new ServerSocket(9999);
		
		while(true) {
			//accept方法等待等待客户端连接
			Socket client = serverSocket.accept();
			//显示已连接
			System.out.println("客户端已连接");
			
			//向客户端发信息，读客户端信息	
			//in就是客户端写过来的数据
			InputStream in = client.getInputStream();
			
			//out就是向客户端发的信息
			OutputStream out = client.getOutputStream();
			//转换以下以为是字节，getBytes方法
			out.write("DDD,hello HHHClient".getBytes());
			//输出玩一定要刷新
			out.flush();
			
			//定义数组接受读取客户端发来的信息
			byte[] bytes=new byte[1024];
			//count代表从bytes里面读取到多少个字节，返回的bytes里面的实际长度
			int count = in.read(bytes);
			//字节类型的输出
			System.out.println(new String(bytes));
			System.out.println(count);
			
			//服务端是先写后读
			//两个一起读就会造成堵塞，一起写的话就可以
			
			//关闭
			client.close();
			client=null;
		}
	}

}
