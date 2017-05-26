package com.sort;
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
		int[] arr = {10,2,4,5,1,56,23};
		insertSort(arr);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
