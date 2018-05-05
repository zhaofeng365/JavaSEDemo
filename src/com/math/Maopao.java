package com.math;

public class Maopao {
	public static void main(String[] args) {
		int[] a = { 7, 3, 4, 1, 5, 2 };
		Sort(a);
		print(a);
	}
	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	/**
	 * 冒泡排序的第一种实现, 没有任何优化
	 * 
	 * @param a
	 * @param n
	 */
	public static void Sort(int[] a) {
		int temp =0 ;
		for (int i = 0; i < a.length; i++) {
			print(a);
			for (int j = 1; j < a.length-i; j++) {//a.length-i 
				if(a[j-1]>a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		
	}
}
