package com.atguigu.day05.exer;

/*
 * ��Ŀһ��
 * ��д���򣬶����������ط��������á�������ΪmOL��
 ���������ֱ����һ��int����������int������һ���ַ����������ֱ�ִ��ƽ�����㲢��������
 ��˲�������������ַ�����Ϣ��
 �������main ()�����зֱ��ò��������������������
��Ŀ����
�����������ط���max()����һ������������intֵ�е����ֵ��
�ڶ�������������doubleֵ�е����ֵ��
����������������doubleֵ�е����ֵ�����ֱ��������������


 */
public class TestOverLoad {
	public static void main(String[] args) {
		TestOverLoad t = new TestOverLoad();
		t.mOL(12);
		t.mOL("www.atguigu.com");
		
		System.out.println(t.max(12, 13));
		System.out.println(t.max(12.1,23.4));
	}
	public double max(double d1,double d2,double d3){
		return (max(d1,d2) > d3)? max(d1,d2) : d3;
	}
	public double max(double d1,double d2){
		//System.out.println("double!!!");
		return (d1 > d2)? d1 : d2;
	}
	public int max(int i,int j){
		return (i > j)? i : j;
	}
	//��������������������
	
	//��������������������
	public void mOL(int i) {
		System.out.println(i * i);
	}

	public void mOL(int i, int j) {
		System.out.println(i * j);
	}

	public void mOL(String str) {
		System.out.println(str);
	}
}
