package 常用类;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;import javax.swing.SpinnerListModel;

import org.junit.Test;

public class Demo {
	
	@Test
	public void demo1() {
		//object是默认所有类的父类，很多时候都有一些相同的需求，获取内存地址，判断是多例还是多例。
//		Object object=new Object();
//		String string=object.toString();
//		System.out.println(string);
		//默认情况下，==和equals都是比较内存地址的
		//例如下
//		Student s1=new Student();
//		Student s2=new Student();
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		//String,Integer等重写了equals方法，去比较内容。比较内容就是使用equals，String重写了equals所以比较的是内容
		String str="abc";
		String str2=new String("abc");
		System.out.println(str==str2);	
		System.out.println(str.equals(str2));
	}
	
	@Test
	public void demo2() {
		//这时候创建了3个对象，String的长度是定长的，它改了之后就是又创建了个新的
		//少量的修改可以用String，大量的话会有垃圾存留，会占用内存，所以用StringBuffer和StringBuilder
//		String string = new String();
//		String str2="abc";
//		str2=str2+"123";
//		System.out.println(str2);
		
		//StringBuffer类似于数组的原理
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
				//说明是请求头
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
