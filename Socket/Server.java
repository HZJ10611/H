package SocketTest01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//����ӿ�9999
		ServerSocket serverSocket = new ServerSocket(9999);
		
		while(true) {
			//accept�����ȴ��ȴ��ͻ�������
			Socket client = serverSocket.accept();
			//��ʾ������
			System.out.println("�ͻ���������");
			
			//��ͻ��˷���Ϣ�����ͻ�����Ϣ	
			//in���ǿͻ���д����������
			InputStream in = client.getInputStream();
			
			//out������ͻ��˷�����Ϣ
			OutputStream out = client.getOutputStream();
			//ת��������Ϊ���ֽڣ�getBytes����
			out.write("DDD,hello HHHClient".getBytes());
			//�����һ��Ҫˢ��
			out.flush();
			
			//����������ܶ�ȡ�ͻ��˷�������Ϣ
			byte[] bytes=new byte[1024];
			//count�����bytes�����ȡ�����ٸ��ֽڣ����ص�bytes�����ʵ�ʳ���
			int count = in.read(bytes);
			//�ֽ����͵����
			System.out.println(new String(bytes));
			System.out.println(count);
			
			//���������д���
			//����һ����ͻ���ɶ�����һ��д�Ļ��Ϳ���
			
			//�ر�
			client.close();
			client=null;
		}
	}

}
