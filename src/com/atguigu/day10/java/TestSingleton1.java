package com.atguigu.day10.java;
//����ʽ:���ܴ����̰߳�ȫ�����
public class TestSingleton1 {
	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		System.out.println(s1 == s2);
		
	}
}
class Singleton1{
	//1.
	private Singleton1(){
		
	}
	//2.
	private static Singleton1 instance = null;
	//3.
	public static Singleton1 getInstance(){
		
		if(instance == null){
			
			instance = new Singleton1();
		}
		return instance;
	}
}