package com.atguigu.day02;
/*
��д�����ɼ����������������ֱ�������num1��num2��num3��
�����ǽ�������(ʹ�� if-else if-else),���Ҵ�С���������

˵�������if-else if-else������ִ������{}ֻ��һ�����Ļ�����ô��һ��{}����ʡ��
���飺��Ҫʡ��{}
*/
import java.util.Scanner;
class TestIf3{
	public static void main(String[] args) {
		//1.�Ӽ��̻�ȡ��������
		Scanner s = new Scanner(System.in);
		System.out.println("�������һ��������");
		int num1 = s.nextInt();
		System.out.println("������ڶ���������");
		int num2 = s.nextInt();
		System.out.println("�����������������");
		int num3 = s.nextInt();

		//2.��num1��num2��num3��С��������
		System.out.println("��С���������Ϊ��");
		if(num1 > num2){
			if(num3 > num1)
				System.out.println(num2 + "," + num1 + "," + num3);
			//System.out.println("helloworld");
			else if(num3 < num2)
				System.out.println(num3 + "," + num2 + "," + num1);
			else
				System.out.println(num2 + "," + num3 + "," + num1);
			
		}else{
			if(num3 > num2)
				System.out.println(num1 + "," + num2 + "," + num3);
			else if(num3 < num1)
				System.out.println(num3 + "," + num1 + "," + num2);
			else
				System.out.println(num1 + "," + num3 + "," + num2);
			
		}
	
	}
}
