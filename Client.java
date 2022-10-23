package SocketTest01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		//ip和接口,就是拿的server，和server通信
		Socket server = new Socket("127.0.0.1",9999);
		
		//服务端写过来的数据放到in，从in里面读
		InputStream in = server.getInputStream();
		
		//客户端给服务端写数据放到out
		OutputStream out = server.getOutputStream();
			
		//定义数组接受读取服务端发来的信息
		byte[] bytes=new byte[1024];	
		//count代表从bytes里面读取到多少个字节，返回的bytes里面的实际长度
		int count = in.read(bytes);	
		//字节类型的输出
		System.out.println(new String(bytes));	
		System.out.println(count);
		
		//out向服务端写数据
		out.write("HHH,hello DDDServer".getBytes());
		//输出玩一定要刷新
		out.flush();
		
		//客户端是先读后写
	}

}
