package ������;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;import javax.swing.SpinnerListModel;

import org.junit.Test;

public class Demo {
	
	@Test
	public void demo1() {
		//object��Ĭ��������ĸ��࣬�ܶ�ʱ����һЩ��ͬ�����󣬻�ȡ�ڴ��ַ���ж��Ƕ������Ƕ�����
//		Object object=new Object();
//		String string=object.toString();
//		System.out.println(string);
		//Ĭ������£�==��equals���ǱȽ��ڴ��ַ��
		//������
//		Student s1=new Student();
//		Student s2=new Student();
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		//String,Integer����д��equals������ȥ�Ƚ����ݡ��Ƚ����ݾ���ʹ��equals��String��д��equals���ԱȽϵ�������
		String str="abc";
		String str2=new String("abc");
		System.out.println(str==str2);	
		System.out.println(str.equals(str2));
	}
	
	@Test
	public void demo2() {
		//��ʱ�򴴽���3������String�ĳ����Ƕ����ģ�������֮������ִ����˸��µ�
		//�������޸Ŀ�����String�������Ļ�����������������ռ���ڴ棬������StringBuffer��StringBuilder
//		String string = new String();
//		String str2="abc";
//		str2=str2+"123";
//		System.out.println(str2);
		
		//StringBuffer�����������ԭ��
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer append = sb.append("123");
		StringBuffer reverse = sb.reverse();
		//reverse.delete(2, 4);
		reverse.replace(2, 4, "hello");
		System.out.println(reverse);
	}
	
	@Test
	public void demo3() {
		String https="https:\r\n //www.yiyyy:.com/ \r\n essay/post-3003888.html";
		String[] split = https.split("\r\n");
		for (int i=0;i<=split.length-2;i++) {
			String string = split[i];
			if(string.contains(":")) {
				//˵��������ͷ
				String[] split2 = string.split(":");
				System.out.println(split2[0].trim());
			}
		}
	}
	
	@Test
	public void demo4() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String format = simpleDateFormat.format(date);
		java.sql.Date date2 = new java.sql.Date(date.getTime());
		System.out.println(format);
		System.out.println(date2);
	}
}
