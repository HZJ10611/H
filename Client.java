package SocketTest01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		//ip�ͽӿ�,�����õ�server����serverͨ��
		Socket server = new Socket("127.0.0.1",9999);
		
		//�����д���������ݷŵ�in����in�����
		InputStream in = server.getInputStream();
		
		//�ͻ��˸������д���ݷŵ�out
		OutputStream out = server.getOutputStream();
			
		//����������ܶ�ȡ����˷�������Ϣ
		byte[] bytes=new byte[1024];	
		//count�����bytes�����ȡ�����ٸ��ֽڣ����ص�bytes�����ʵ�ʳ���
		int count = in.read(bytes);	
		//�ֽ����͵����
		System.out.println(new String(bytes));	
		System.out.println(count);
		
		//out������д����
		out.write("HHH,hello DDDServer".getBytes());
		//�����һ��Ҫˢ��
		out.flush();
		
		//�ͻ������ȶ���д
	}

}
