package com.sort;

import java.util.Random;

/**
 * 插入排序
 * @author Administrator
 *
 */
public class InsertSort {
	public static void insertSort() {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			temp = a[i];
			for (; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j]; // 将大于temp的值整体后移一个单位
			}
			a[j + 1] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}
	public static void main(String[] args) {
		//insertSort();
		int[] arr = {3,7,4,15,2};
		/*int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(10000);
		}*/
		insertSort(arr);
	}
	
	/**
	 * 设定第一个元素是有序的，依次循环后面元素，插入到前面有序元素中
	 * @param arr
	 */
	public static void insertSort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j;
			for (j = i-1; j >=0 && temp<arr[j] ; j--) {
				 arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		} 
		
		 for (int m = 0; m < arr.length; m++) {
			System.out.print(arr[m]+"\t");
		} 
		
	}
}
