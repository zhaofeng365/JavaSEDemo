package com.math;

import java.util.Scanner;

public class Zhiyinshu {

	public static void main(String[] args) {
		System.out.println("输入一个数进行分解：");
		Scanner s = new Scanner(System.in);
		while(true) {
			factor(s.nextInt());
			System.out.println();
		}
	}

	// 函数：进行分解质因数
	static void factor(int number) {
		for (int i = 2; i < number; i++) {
			System.out.println(i+"  "+number);
			if (number % i == 0) { //余数为0
				System.out.print(i + "  ");
				 // 判断number/i是不是素数，如果是素数就直接输出
				if (isPrime(number / i)) {
					System.out.print(number / i + "  ");
				} else {
					factor(number / i);;
				}
				return; // 或者break
 			}
		}
	}

	// 函数：判断是不是素数（又称质数）。除了1和它本身，不能被其它自然数整除
	static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}