package com.interview;

import java.util.Arrays;

public class QuickSort {

	//int a2[] = {49,38,65,97,76,13,27,41,78,34};//28
		public static int getMiddle(int[] list, int low, int high) {
		 
			int tmp = list[low]; // 数组的第一个作为中轴
			//采用的是分治思想
			while (low < high) {
				
					while (low < high && tmp <= list[high]) {
						high--; //目的是找出比中轴小的数据
					}
					
					list[low] = list[high]; //比中轴小的记录移到低端
					
					while (low < high && tmp >= list[low]  ) {
						low++;//目的是找出比中轴大的数据
					}
				 
					list[high] = list[low]; // 比中轴大的记录移到高端
			}

			list[low] = tmp; // 中轴记录到尾
			 
			return low; // 返回中轴的位置

		}

		public static void _quickSort(int[] list, int low, int high) {

			if (low < high) {
 
				int middle = getMiddle(list, low, high); // 将list数组进行一分为二

				_quickSort(list, low, middle - 1); // 对低字表进行递归排序

				_quickSort(list, middle + 1, high); // 对高字表进行递归排序

			}

		}

		public static void main(String[] args) {
			//int a2[] = {1,4,75,34,22,67,43,2,3,18,1,9,21,43,54,22};//16个元素
			int a2[] = {1,4,75,34,22,67};//6个元素
			System.out.println("-------------------------排序之前--------------------------"+Arrays.toString(a2));
			_quickSort(a2, 0, a2.length - 1);
			System.out.println("-------------------------排序之后--------------------------"+Arrays.toString(a2));
		 
		}


}
