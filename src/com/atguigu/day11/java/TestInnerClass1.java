package com.atguigu.day11.java;

/*
 * ���ھֲ��ڲ����ʹ��
 */
public class TestInnerClass1 {
	
}

class OuterClass{
	//�ֲ��ڲ���
	//���µ�ʹ�÷�ʽ����
	public void method1(){
		
		class InnnerClass{
			
		}
	}
	//����ʹ��һ��������ʹ�䷵��ֵΪĳ�����ӿڵĶ��󡣶�������ӿ��ڷ����ڲ�����
	//ʹ�÷�ʽһ
	public Comparable getComparable(){
		//1.����һ��ʵ��Comparable�ӿڵ���:�ֲ��ڲ���
		class MyComparable implements Comparable{

			public int compareTo(java.lang.Object o) {
				return 0;
			}
			
		}
		//2.����һ��ʵ����Ķ���
		return new MyComparable();
	}
	//ʹ�÷�ʽ��
	public Comparable getComparable1(){
		//����һ��ʵ��Comparable�ӿڵ������ڲ���Ķ���
		return new Comparable(){

			public int compareTo(java.lang.Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
}
