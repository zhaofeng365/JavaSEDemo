package com.atguigu.day06.java1;
/*
 * һ����ĵ�������Ա��������(constructor ���췽��)   construction  CCB  ICBC   oop
 * constructor:������ 
 * �����������ã��ٴ������� �ڸ������Ķ�������Ը�ֵ
 * 
 * 1.�����ʱ��������ʽ������Ĺ������Ļ��������Ĭ���ṩһ���ղεĹ�����
 * 2.һ����ʽ�Ķ�����Ĺ���������ôĬ�ϵĹ������Ͳ����ṩ��
 * 3.���������Ĺ���������ʽ��Ȩ�����η�  ����(�β�){ }
 * 4.��Ķ��������֮�乹������
 * 
 * 
 * �������������Ը�ֵ���Ⱥ�˳�򣺢����Ե�Ĭ�ϳ�ʼ�� �����Ե���ʽ��ʼ����ͨ�������������Գ�ʼ��
 * 						  ��ͨ��"����.����"�ķ�ʽ�����Ը�ֵ
 * 
 */
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.getName() + ":" + p1.getAge());
		String str = new String("atguigu.com");
		System.out.println(str);
		
		Person p2 = new Person("����");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		Person p3 = new Person("����",23);
		System.out.println("name:" + p3.getName() + " age:" + p3.getAge());
		//������Ը�ֵ�Ĺ���
		Person p4 = new Person();
		System.out.println("name:" + p4.getName() + " age:" + p4.getAge());
		
		Person p5 = new Person(12);
		System.out.println("name:" + p5.getName() + " age:" + p5.getAge());
	}
}
class Person{
	//����
	private String name;
	private int age = 1;
	
	//������
	public Person(String n){
		name = n;
	}
	public Person(){
//		age = 10;
//		name = "����";
	}
	public Person(int a){
		age = a;
	}
	public Person(String n,int a){
		name = n;
		age = a;
	}
	
	//����
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
