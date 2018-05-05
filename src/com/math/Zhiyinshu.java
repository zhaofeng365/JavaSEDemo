package com.math;

import java.util.Scanner;

public class Zhiyinshu {

	public static void main(String[] args) {
		System.out.println("����һ�������зֽ⣺");
		Scanner s = new Scanner(System.in);
		while(true) {
			factor(s.nextInt());
			System.out.println();
		}
	}

	// ���������зֽ�������
	static void factor(int number) {
		for (int i = 2; i < number; i++) {
			System.out.println(i+"  "+number);
			if (number % i == 0) { //����Ϊ0
				System.out.print(i + "  ");
				 // �ж�number/i�ǲ��������������������ֱ�����
				if (isPrime(number / i)) {
					System.out.print(number / i + "  ");
				} else {
					factor(number / i);;
				}
				return; // ����break
 			}
		}
	}

	// �������ж��ǲ����������ֳ�������������1�����������ܱ�������Ȼ������
	static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}