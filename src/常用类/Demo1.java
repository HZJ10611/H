package ������;

import org.ietf.jgss.Oid;
import org.junit.Test;

public class Demo1 {

	@Test
	public void dmeo1() {
		Object object = new Object();
		String string = object.toString();
		System.out.println(string);
	}
	
	@Test
	public void demo2() {
//		String s1=new String();
//		String s2 =new String();
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
	
	@Test
	public void demo3() {
		String s1="abc";
		s1=s1+"123";
		System.out.println(s1);
		StringBuffer s2 = new StringBuffer("abc");
		s2.append("123");
		s2.reverse();
//		s2.delete(2, 4);
		s2.replace(2, 4, "djm");
		System.out.println(s2);
	}
	
	@Test
	public void demo4() {
		//������
		String s1="hello";
		//���ڴ�,charAt����
		String s2=new String("world");
		char charAt = s1.charAt(0);
		System.out.println(charAt);
		
	}
	
	@Test
	public void demo5() {
		//compareTo  �ֵ�˳����Ӽ�
		String abc="a";
		String a1=new String("A");
		int compareTo = abc.compareTo(a1);
		System.out.println(compareTo);
		//���
		String a="cba";
		String b=new String("cdb");
		int compareTo2 = a.compareTo(b);
		System.out.println(compareTo2);
		//�ַ�������
		String concat = a.concat(b);
		System.out.println(concat);
		boolean contains = a.contains("b");
		System.out.println(contains);
	}
	
	@Test
	public void demo6() {
		String abc="hzj.djm";
		boolean endsWith = abc.endsWith(".djm");
		System.out.println(endsWith);
		String b=new String("abc");
		byte[] bytes = b.getBytes();
		for (byte c : bytes) {
			System.out.println(c);
		}
	}
	
	@Test
	public void demo7() {
		//��дתСд
		String a="HZJ";
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);
		//Сдת��д
		String b="djm";
		String upperCase = b.toUpperCase();
		System.out.println(upperCase);
		//�ַ���ת��Ϊ����
		String c="HZJDJM";
		char[] charArray = c.toCharArray();
		for (char d : charArray) {
			System.out.println(d);
		}
	}
	
	@Test
	public void demo8() {
		StringBuilder sb=new StringBuilder("123456");
		char a[]=new char[10];
		//�±��0��ʼ5����������������a�дӵ�һ����ʼ��������0
		sb.getChars(0, 5, a, 1);
		System.out.println(a);
		
	}
}
