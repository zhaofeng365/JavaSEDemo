package com.atguigu.day11.java;

/*
 * ��ĵ�5����Ա���ڲ���
 * 1.�൱��˵�����ǿ���������ڲ��ٶ����ࡣ������ࣺ�ⲿ�ࡣ���涨����ࣺ�ڲ���
 * 2.�ڲ���ķ��ࣺ��Ա�ڲ��ࣨ���������ڲ��ҷ�����ģ�  vs �ֲ��ڲ���(��������ķ�����)
 * 3.��Ա�ڲ��ࣺ
 * 		3.1���ⲿ���һ����Ա���ٿ��������η���4������static final �ۿ��Ե����ⲿ������ԡ�����
 * 			
 * 		3.2��������ص㣺��abstract �ڻ����������ڲ��������ԡ�������������
 * 
 * 4.�ֲ��ڲ��ࣺ
 * 
 * 5.�����ڲ��࣬����������㣺
 *   ����δ�����Ա�ڲ���Ķ����磺����Bird���Dog��Ķ���
 *   ��������ֵ����ⲿ�ࡢ�ڲ���ı���(�����Ǳ�������ʱ)
 *   �۾ֲ��ڲ����ʹ�� ����TestInnerClass1.java��
 * 
 */
public class TestInnerClass {
	public static void main(String[] args) {
		//������̬�ڲ���Ķ��󣺿���ֱ��ͨ���ⲿ����þ�̬�ڲ���Ĺ�����
		Person.Dog d = new Person.Dog();//Person.new Dog();
		//Person.Bird b = new Person.Bird();
		//�����Ǿ�̬���ڲ���Ķ��󣺱����ȴ����ⲿ��Ķ���ͨ���ⲿ��Ķ�������ڲ���Ĺ�����
		Person p = new Person();
		Person.Bird b = p.new Bird();//new p.Bird();
		b.info();
		b.setName("�ž�");
	}
}

class Person{
	String name = "��÷÷";
	int age;
	//��Ա�ڲ���(��static��)
	class Bird{
		String name = "���";
		int id;
		
		public Bird(){
			
		}
		public void setName(String name){
			System.out.println(name);//�ž�
			System.out.println(this.name);//���
			System.out.println(Person.this.name);//��÷÷
		}
		public void info(){
			show();
		}
	}
	//��Ա�ڲ���(��̬�ڲ���)
	static class Dog{
		
	}
	
	public void show(){
		System.out.println("����show()����");
	}
	
	public void method1(){
		class A{
			
		}
	}
}