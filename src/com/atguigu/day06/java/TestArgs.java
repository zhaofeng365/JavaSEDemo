package com.atguigu.day06.java;

 
/*
 * �ɱ�������βεķ�����
 * 1.��ʽ�����ڷ������βΣ� �������� ... �β���
 * 2.�ɱ�������βεķ�����ͬ���ķ���֮�乹������
 * 3.�ɱ�������β��ڵ���ʱ��������0��ʼ���������������ԡ�
 * 4.ʹ�ÿɱ����βεķ����뷽�����β�ʹ��������һ�µġ�
 * 5.�������д��ڿɱ�������βΣ���ôһ��Ҫ�����ڷ����βε����
 * 6.��һ�������У��������һ���ɱ�������βΡ�
 */
public class TestArgs {
	public static void main(String[] args) {
		TestArgs t = new TestArgs();
		t.sayHello();
		//t.sayHello(new String[]{"hello China","hello BeiJing"});
		t.sayHello("hello China","hello BeiJing");
	}
	
	//�����ĸ�������������
	//������һ�����������صĿɱ�������βεķ����Ժ����µ�������������ʡ��
//	public void sayHello(){
//		System.out.println("hello world!");
//	}
//	public void sayHello(String str1){
//		System.out.println("hello " + str1);
//	}
	//�ɱ�������βεķ���
	public void sayHello(String ... args){
		for(int i = 0;i < args.length;i++){
			System.out.println(args[i] + "$");
		}
		//System.out.println("=====");
	}
	
	public void sayHello(int i,String ... args){
	//public void sayHello(String ... args,int i){
		System.out.println(i);
		
		for(int j = 0;j < args.length;j++){
			System.out.println(args[j] + "$");
		}
	}
	
	public void sayHello1(String[] args){
		for(int i = 0;i < args.length;i++){
			System.out.println(args[i]);
		}
	}
	
	//�ɱ�����βε�ʹ�õ�����
//	public int getSum(int i,int j){
//		return i + j;
//	}
//	public int getSum(int i,int j,int k){
//		return i + j + k;
//	}
	public int getSum(int ... args){
		int sum = 0;
		for(int i = 0;i < args.length;i++){
			sum += args[i];
		}
		return sum;
	}
		
}
