package com;

public class Paixu {
	public static void main(String[] args) {
		char[] in = "abcde".toCharArray();
		new Paixu().paixu(in, in.length, 0);
	}

	int count = 0 ;
	private void paixu(char[] array, int n, int k) {
		count++;
		if (n == k) {
			char[] out = new char[n];
			for (int i = 0; i < array.length; i++) {
				out[i] = array[i];
			}
			System.out.println(count+"ÅÅÁÐ×éºÏ"+new String(out));
		} else {
			for (int i = k; i < n; i++) {
				swap(array, k, i);
				paixu(array, n, k + 1);
				swap(array, i, k);
			}
		}
	}

	private void swap(char[] a, int x, int y) {
		char temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}