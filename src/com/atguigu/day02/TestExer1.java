package com.atguigu.day02;
class TestExer1{
	public static void main(String[] args){
		int m = 12;
		int n = 5;
		System.out.println("m:" + m + " n:" + n);
		//����һ���ṩһ����ʱ������
		//int temp = m;
		//       m = n;
		//       n = temp;
		//System.out.println("m:" + m + " n:" + n);

		//����������m��n�ϴ�ʱ���п��ܳ��־�����ʧ
		//m = m + n;//m = 12 + 5;
		//n = m - n;//n = 17 - 5;
		//m = m - n;//m = 17- 12
		//System.out.println("m:" + m + " n:" + n);

		//���������ŵ㣺û���������ַ�����ȱ�㡣 ȱ�㣺�ѣ�
		m = m ^ n;
		n = m ^ n;//(m ^ n) ^ n == m
		m = m ^ n;//(m ^ n) ^ m == n
		System.out.println("m:" + m + " n:" + n);
		
		//���⣺
		//60  �ֶ��ķ�ʽ���ӿ���̨���60��ʮ�����ơ�
		int i = 61;
		//�Զ�����Integer���ֳɵķ���
		String binary = Integer.toBinaryString(i);
		
		System.out.println(binary);

		String hex = Integer.toHexString(i);
		System.out.println(hex);
		
		/*
		char c = 'a';
		char c1 = (char)(c + 2);
		System.out.println(c1);//c
		*/

		int j = i & 15;//��ȡ��i�����4λ��Ӧ��ֵ��
		String k1 = (j <= 9)? j + "" : (char)(j - 10 + 'a') + ""; 
		//System.out.println(k1);

		i = i >> 4;
		int z = i & 15;
		String k2 = (z <= 9)? z + "" : (char)(z - 10 + 'a') + "";
		
		System.out.println(k2 + k1);
	}
}
