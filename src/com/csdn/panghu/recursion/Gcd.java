package com.csdn.panghu.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Description: [�ݹ����gcdŷ������㷨]
 * @Author: [�ֻ�]
 * @CreateDate: [2014-3-31 ����10:51:47]
 * @CsdnUrl: [http://blog.csdn.net/ljphhj]
 */
public class Gcd {

	public static int gcd(int m, int n) {
		/* �ݹ��ս����� */
		if (n == 0) {
			return m;
		}
		/* �ݹ���� */
		return gcd(n, m % n);
	}

	public static void main(String[] args) {
		//System.out.println(Gcd.gcd(6, 4));

		int n = 10;
		System.out.println(n + "�����" + cattle(n) + "ͷţ");

		//bings();
		
		//zishu();
		heshu();
	}

	public static int cattle(int n) {
		if (n <= 0) {
			return 0;
		} else if (n <= 3) {
			return 1;
		} else {
			return cattle(n - 1) + cattle(n - 3);
		}
	}

	public static String bings() {
		String str = "�����������в��в����˶�Ա�˶�Ա";

		List<String> data = new ArrayList<String>();

		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i + 1);
			if (!data.contains(s)) {
				data.add(s);
			}
		}

		String result = "";
		for (String s : data) {
			result += s;
		}
		System.out.println(result);
		return result;
	}
	/**
	 * ���������ֻ�ܱ�1������������������
	 */
	public static void zishu() {
		int j;
		// 1��������������ֱ�Ӵ�2��ʼѭ��
		for (int i = 2; i <= 100; i++){
			j = 2;
			while (i % j != 0) {
				j++; // ����2��i�������Ƿ��ܱ�i�������粻�ܾ��Լ�
			}
			// ���б�����������ʱ���ж����ǲ�������
			if (j == i){
				System.out.println(i); // ����Ǿʹ�ӡ������
			}
		}
	}
	/**
	 * ����������ܱ�1��������֮������������
	 */
	public static void heshu() {
		int j;
		// 1��������������ֱ�Ӵ�2��ʼѭ��
		for (int i = 2; i <= 100; i++){
			j = 2;
			while(i % j != 0) {
				j++; // ����2��i�������Ƿ��ܱ�i�������粻�ܾ��Լ�
			}
			// ���б�����������ʱ���ж����ǲ�������
			if (j != i){
				System.out.println(i); // ����Ǿʹ�ӡ������
			}
		}
	}

}
