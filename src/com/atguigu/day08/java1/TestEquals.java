package com.atguigu.day08.java1;

public class TestEquals {
	public static void main(String[] args) {
//		TestEquals t = new TestEquals();
//		t.test1();
		
		//equals():
		//��ֻ�ܴ����������ͱ�������Object�࣬����equals()��Ȼ�Ƚϵ��������ñ����ĵ�ֵַ�Ƿ����
		//java.lang.Object�࣬��������ĸ�����
		
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.equals(p2));//false --->true
		System.out.println(p1==p2);//false
		
		//��String ��װ�� File�� Date����Щ��дObject���equals()�������Ƚ������������
		//"ʵ������"�Ƿ���ȫ��ͬ��
		String str1 = new String("AA");
		String str2 = new String("AA");
		System.out.println(str1 == str2);//false
		System.out.println(str1.equals(str2));//true
	}

	public void test1() {
		// ==
		// 1.�����������ͣ����ݻ����������͵�ֵ�ж��Ƿ���ȡ���ȷ���true����֮����false
		// ע�������������Ϳ��Բ�ͬ���ڲ�ͬ������£�Ҳ���Է���true��
		// 2.�����������ͣ��Ƚ��������ͱ����ĵ�ֵַ�Ƿ���ȡ�
		int i = 12;
		int j = 12;
		System.out.println(i == j);// true
		char c = 12;
		System.out.println(i == c);// true
		float f = 12.0F;
		System.out.println(i == f);// true

		int k = 65;
		char a = 'A';
		System.out.println(k == a);// true

		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);// false

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = p1;
		System.out.println(p1 == p2);// false
		System.out.println(p1 == p3);// true
	}
}


