package com.atguigu.day05.java;
/*
 * һ���������˼�����ط���һ��
 * 1.����࣬�������ĳ�Ա����Ա����&��Ա������
 * 2.ͨ���࣬��������Ķ���Ҳ�������ʵ������
 * 3.ͨ��������.���ԡ� �򡰶���.�����������ã������Ӧ�Ĺ���
 * 
 * ���������Ķ�����󣬱˴˸���ӵ��һ��������ԡ���������һ����������Խ����޸�ʱ��
 * ����Ӱ�쵽�������������ֵ��
 * 
 * �����������(��Ա����)
 *   ��Ա���� vs �ֲ�����
 *   ��ͬ�㣺1.��ѭ���������ĸ�ʽ�� �������� ������ = ��ʼ��ֵ
 *   	   2.����������
 *   ��ͬ�㣺1.������λ�õĲ�ͬ ����Ա���������������������
 *   					    �ֲ������������ڷ����ڣ��������ββ��֣��������
 *         2.��Ա���������η����ĸ���public private protected ȱʡ
 *           �ֲ�����û�����η��������ڵķ������η���ͬ��
 *         3.��ʼ��ֵ��һ�����г�ʼ��ֵ��
 *         	��Ա����:�����������ʱ�򣬲���ʽ�ĸ�ֵ����ô��ͬ�������ͻ��в�ͬ��Ĭ�ϳ�ʼ��ֵ��
 *            byte short int long ==>0
 *            float double ==>0.0
 *            char ==>�ո�
 *            boolean ==>false 
 *            �������ͱ���==>null
 *          �ֲ�������һ��Ҫ��ʽ�ĸ�ֵ�����ֲ�����û��Ĭ�ϳ�ʼ��ֵ��
 *         4.�������ڴ��д�ŵ�λ�ò�ͬ:��Ա���������ڶѿռ��У��ֲ�������ջ�ռ���
 *         
 * �ܽ᣺���ڱ����ķ��ࣺ1�������������͵Ĳ�ͬ�������������ͣ�8�֣�  & ������������
 * 				   2������������λ�õĲ�ͬ����Ա���� & �ֲ�����
 * 
 * �ġ���ķ������ṩĳ�ֹ��ܵ�ʵ��
 *    1��ʵ����public void eat(){//������}
 *           public String getName(){}
 *           public void setName(String n){}
 *      ��ʽ��Ȩ�����η� ����ֵ���ͣ�void:�޷���ֵ/����ķ���ֵ�� ������(�β�){}
 *      
 *    2)���ڷ���ֵ���ͣ�void�������˷�������Ҫ����ֵ
 *    			   �з���ֵ�ķ������ڷ��������һ����return + ����ֵ���Ͷ�Ӧ�ı���
 *       ���䣺void ��return������ͬʱ����һ�������ڡ���һ�ԡ�ԩ�ҡ���
 * 
 * 	  3)�����ڿ��Ե��ñ�����������������ԣ����ǲ����ڷ������ٶ��巽����
 * 
 * ClassRoom  Car  ...
 */
public class Zoo {
	public static void main(String[] args) {
		//�����������͵��������������� ������ = ��ʼ��ֵ
		int i = 10;
		//���ʵ����:���µ�a1����һ��ʵʵ���ڵĶ���
		Animal a1 = new Animal();
		//int[] arr = new int[10];
		System.out.println("name:" + a1.name + " age:" + a1.age);
		//ͨ�������������
		a1.name = "����";
		a1.age = 3;
		System.out.println("name:" + a1.name + " age:" + a1.age);
		//ͨ��������÷���
		a1.eat();
		a1.sleep();
		
		//�ٴ���һ����Ķ���
		Animal a2 = new Animal();
		System.out.println("name:" + a2.name + " age:" + a2.age);//null 0
		a2.name = "С��";
		System.out.println("name:" + a1.name + " age:" + a1.age);
		System.out.println("name:" + a2.name + " age:" + a2.age);
		
		//a3����ζ�������a1���´�����һ�����󣬶���a1��a3����һ������ʵ��
		Animal a3 = a1;
		System.out.println("name:" + a3.name + " age:" + a3.age);//��a1һ��
		a3.name = "ά����";
		System.out.println("a1��name:" + a1.name + " age:" + a1.age);
		
		System.out.println(a2.getName());//a2.name;
		System.out.println(a2.desc());
	}
}


class Animal{
	//1.����
	String name;
	int age;
	
	//2.����
	public void eat(){
		System.out.println("�����ʳ");
	}
	
	public void sleep(){
		System.out.println("��������");
		//return;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		System.out.println("hello");
		return age;
		//��󲻿����������
		//System.out.println("hello");
	}
	//��ͨ��������ô˷���ʱ���Ὣ�����ķ����ķ���ֵ�ṩ�������ĵ����ߣ�Ҳ���ǵ�ǰ�Ķ���
	public String desc(){
		if(age > 2){
			return "ǡͬѧ����";
		}else{
			return "���ǿ�����Ƭ������";
		}
	}
	public void setName(String n){//n:�ֲ�����
		name = n;
	}
	public void addAge(){
		int i = 0;//�ֲ�����
		age += i;
	}
	public void info(){
//		�����ڷ����ڵ��ñ�����������������ǲ������ڷ����ڶ����µķ���
		eat();
		sleep();
//		public void breath(){
//			System.out.println("����");
//		}
	}
//	System.out.println("hello!");
}