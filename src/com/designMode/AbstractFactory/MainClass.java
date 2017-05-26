package com.designMode.AbstractFactory;
/**
 * ʲô�ǳ��󹤳�ģʽ?
 * ���󹤳�ģʽ��������̬�Ĺ���ģʽ����Ϊ��������һ���Եġ����󹤳�ģʽ������ͻ����ṩһ���ӿڣ�
 * ʹ�ÿͻ����ڲ���ָ����Ʒ�ľ������͵�����£��ܹ����������Ʒ��Ĳ�Ʒ����
 * 
 * ģʽ�а����Ľ�ɫ����ְ��
 *  1.���󹤳���Creator����ɫ���󹤳�ģʽ�ĺ��ģ������Զ����Ʒ�ṹ���������κι����඼����ʵ������ӿڡ�
	2.���幤���� Concrete  Creator����ɫ���幤�����ǳ��󹤳���һ��ʵ�֣�����ʵ����ĳ����Ʒ���еĲ�Ʒ����
	3.����Product����ɫ����ģʽ�����������ж���ĸ��࣬��������������ʵ�������еĹ����ӿڡ�
	4.�����Ʒ��Concrete Product����ɫ����ģʽ�������ľ���ʵ������
	�ܽ᣺���󹤳��з�����Ӧ��Ʒ�ṹ�����幤����Ӧ��Ʒ��
 */
public class MainClass {
	public static void main(String[] args) {
		FruitFactory ff = new NorthFruitFactory();
		Fruit apple = ff.getApple();
		apple.get();
		
		Fruit banana = ff.getBanana();
		banana.get();
		
		FruitFactory ff2= new SouthFruitFactory();
		Fruit apple2 = ff2.getApple();
		apple2.get();
		
		Fruit banana2 = ff2.getBanana();
		banana2.get();
		
		FruitFactory ff3 = new WenshiFruitFactory();
		Fruit apple3 = ff3.getApple();
		apple3.get();
		
		Fruit banana3 = ff3.getBanana();
		banana3.get();
	}
}
