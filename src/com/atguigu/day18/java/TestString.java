package com.atguigu.day18.java;


//import org.junit.Test;

public class TestString {
	/*
	 * 1.�ַ��� ������������͡���װ��֮��ת��
	 * ���ַ��� --->�����������͡���װ��:������Ӧ�İ�װ���parseXxx(String str);
	 * �ٻ����������͡���װ��--->�ַ���:�����ַ��������ص�valueOf()����
	 * 
	 * 2.�ַ������ֽ�������ת��
	 * ���ַ���---->�ֽ�����:�����ַ�����getBytes()
	 * ���ֽ�����---->�ַ����������ַ����Ĺ�����
	 * 
	 * 3.�ַ������ַ�������ת��
	 * ���ַ���---->�ַ����飺�����ַ�����toCharArray();
	 * ���ַ�����---->�ַ���:�����ַ����Ĺ�����
	 */
	//@Test
	public void test5(){
		//1.�ַ��� ������������͡���װ��֮��ת��
		String str1 = "123";
		int i = Integer.parseInt(str1);
		System.out.println(i);
		String str2 = i + "";
		str2 = String.valueOf(i);
		System.out.println(str2);
		System.out.println();
		//2.�ַ������ֽ�������ת��
		String str = "abcd123";
		byte[] b = str.getBytes();
		for(int j = 0;j < b.length;j++){
			System.out.println((char)b[j]);
		}
		String str3 = new String(b);
		System.out.println(str3);
		System.out.println();
		//3.�ַ������ַ�������ת��
		String str4 = "abc123�й���";
		char[] c = str4.toCharArray();
		for(int j = 0;j < c.length;j++){
			System.out.println(c[j]);
		}
		String str5 = new String(c);
		System.out.println(str5);
	}
	
	/*
	 * 	public String substring(int startpoint)
		public String substring(int start,int end):���ش�start��ʼ��end������һ������ҿ����Ӵ���start���Դ�0��ʼ�ġ�
		pubic String replace(char oldChar,char newChar)
		public String replaceAll(String old,String new)
		public String trim()��ȥ����ǰ�ַ�������β���ֵĿո����ж������ȥ�������
		public String concat(String str):���ӵ�ǰ�ַ�����str
		public String[] split(String regex)������regex����ǰ�ַ�����֣����Ϊ����ַ��������巵��ֵΪString[]

	 */
	//@Test
	public void test4() {
		String str1 = "�����й�Ƚ�������";
		String str2 = "�Ϻ��й�Ƚ���";
		String str3 = str1.substring(2, 5);
		System.out.println(str3);
		System.out.println(str1);
		String str4 = str1.replace("����", "����");
		System.out.println(str4);// �����й�Ƚ�������
		System.out.println(str1);// �����й�Ƚ�������
		String str5 = "   abc   d  ";
		String str6 = str5.trim();
		System.out.println("----" + str6 + "----");
		System.out.println("----" + str5 + "----");
		String str7 = str1.concat(str2);
		System.out.println(str1);
		System.out.println(str7);
		System.out.println();
		
		String str8 = "abc*d-e7f-ke";
		String[] strs = str8.split("-");
		for(int i = 0;i < strs.length;i++){
			System.out.println(strs[i]);
		}

	}

	/*
	 * public int length() public char charAt(int
	 * index):������ָ��indexλ�õ��ַ���index��0��ʼ public boolean equals(Object
	 * anObject)���Ƚ������ַ����Ƿ���ȡ���ȷ���true�����򷵻�false public int compareTo(String
	 * anotherString) public int indexOf(String s)������s�ַ����ڵ�ǰ�ַ������״γ��ֵ�λ�á���û�У�����-1
	 * public int indexOf(String s ,int
	 * startpoint)������s�ַ����ӵ�ǰ�ַ���startpointλ�ÿ�ʼ�ģ��״γ��ֵ�λ�á� public int
	 * lastIndexOf(String s):����s�ַ������һ���ڵ�ǰ�ַ����г��ֵ�λ�á����ޣ�����-1 public int
	 * lastIndexOf(String s ,int startpoint) public boolean startsWith(String
	 * prefix):�жϵ�ǰ�ַ����Ƿ���prefix��ʼ�� public boolean endsWith(String
	 * suffix)���жϵ�ǰ�ַ����Ƿ���suffix������ public boolean regionMatches(int
	 * firstStart,String other,int otherStart ,int length):
	 * �жϵ�ǰ�ַ�����firstStart��ʼ���Ӵ�����һ���ַ���other��otherStart��ʼ��length���ȵ��ִ��Ƿ�equals
	 */
	//@Test
	public void test3() {
		String str1 = "abccdefghijkbcc";
		String str2 = "bcc";
		String str3 = "jkbcc";
		System.out.println(str2.length());
		System.out.println(str1.charAt(10));
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals("abcc"));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.indexOf(str2, 5));
		System.out.println(str1.lastIndexOf(str2));
		System.out.println(str1.startsWith("abcd"));
		System.out.println(str1.regionMatches(10, str3, 0, str3.length()));

	}

	/*
	 * String:�����ɱ���ַ����С��ײ�ʹ��char[]��š�
	 * String ��final�ġ�
	 */
	//@Test
	public void test1(){
		String str1 = "JavaEE";
		String str2 = "JavaEE";
		String str3 = new String("JavaEE");
		String str4 = "JavaEE" + "Android";
		String str5 = "Android";
		String str6 = str1 + str5;
		str5 = str5 + "Handoop";
		String str7 = str6.intern();
		String str8 = "JavaEEAndroid";
		System.out.println(str1 == str2);//true
		System.out.println(str1 == str3);//false
		System.out.println(str1.equals(str3));//true
		
		System.out.println(str4 == str6);//false
		System.out.println(str4.equals(str6));//true
		System.out.println(str7 == str4);//true
		System.out.println(str4 == str8);//true
		
		Person p1 = new Person("AA");
		Person p2 = new Person("AA");
		System.out.println("^_^"+ (p1.name == p2.name));//true
	}
}

class Person{
	String name;
	Person(String name){
		this.name = name;
	}
}