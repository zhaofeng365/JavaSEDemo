package com.atguigu.day05.java;

import java.util.Scanner;

/*
 * 1.�������ı�̹�ע��������
 * 2.�����ʵ���Ͼ��������ĳ�Ա
 * 3.��������ĳ�Ա�����ԣ���Ա������Field��  & ������Method��
 */
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.info();
		
		p1.name = "�ӳ�";
		p1.age = 21;
		p1.sex = true;
		p1.info();
		
		p1.setName("���");//p1.name = "���"
		p1.info();
		
		Person p2 = p1;
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
		p2.info();
		
		p2 = new Person();
		System.out.println("p2:" + p2);
		p2.info();
		
		//ʵ����Scanner��Ķ���ͨ���˶���.nextXxx()���ã������Ӧ�Ĺ��ܡ�
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		Person p3 = new Person();
		p3.info();
	}
}
//�ࣺ�ǳ���ġ�
class Person{
	//1.���ԣ�
	String name;
	int age = 10;
	boolean sex;
	
	//2.����
	public void eat(){
		System.out.println("�˳Է�");
	}
	public void sleep(){
		System.out.println("��˯��");
	}
	
	public String getName(){
		return name;
	}
	//������name��ֵ
	public void setName(String n){
		name = n;
	}
	
	public void info(){
//		eat();
//		sleep();
		System.out.println("name:" + name + " age:" + age + " sex:" + sex);
	}
}


