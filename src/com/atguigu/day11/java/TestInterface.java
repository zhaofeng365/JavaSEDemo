package com.atguigu.day11.java;

//�ӿ�������ʵ����֮��Ҳ���ڶ�̬��
public class TestInterface {
	
	public static void main(String[] args) {
		Duck d = new Duck();
		TestInterface.test1(d);
		TestInterface.test2(d);
		TestInterface.test3(d);
	}
	
	public static void test1(Runner r){//Runner r = new Duck();
		r.run();//���ⷽ������
	}
	public static void test2(Swimmer s){//Swimmer s = new Duck();
		s.swim();
	}
	public static void test3(Flier f){//Flier f = new Duck();
		f.fly();
	}
}

interface Runner{
	public abstract void run();
}
interface Swimmer{
	void swim();
}
interface Flier{
	void fly();
}

class Duck implements Runner,Swimmer,Flier{

	
	public void fly() {
		System.out.println("��СѼҲ���Ա�ɰ���죡");
	}

	
	public void swim() {
		System.out.println("���Ʋ��岨");
	}

	
	public void run() {
		System.out.println("Ѽ��ƨ��ŤŤ����·");
	}
	
}
