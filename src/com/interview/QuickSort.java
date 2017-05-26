package com.interview;

public class QuickSort {

	//int a2[] = {49,38,65,97,76,13,27,41,78,34};//28
		public static int getMiddle(int[] list, int low, int high) {
			for (int i = 0; i < list.length; i++) {
				System.out.print(list[i]+" ");
			}
			System.out.println("");
			System.out.println("-------------------------BEGIN--------------------------");
			int tmp = list[low]; // 数组的第一个作为中轴
			while (low < high) {
				while (low < high && list[high] >= tmp) {
					high--;
				}
				list[low] = list[high]; // 比中轴小的记录移到低端
				for (int i = 0; i < list.length; i++) {
					System.out.print(list[i]+" ");
					if(i==list.length-1){
						System.out.println();
					}
				}
				while (low < high && list[low] <= tmp) {
					low++;
				}
				 System.out.println(high+ "  "+low);
				list[high] = list[low]; // 比中轴大的记录移到高端
				for (int i = 0; i < list.length; i++) {
					System.out.print(list[i]+" ");
					if(i==list.length-1){
						System.out.println();
					}
				}

			}

			list[low] = tmp; // 中轴记录到尾
			for (int i = 0; i < list.length; i++) {
				System.out.print(list[i]+" ");
				if(i==list.length-1){
					System.out.println();
				}
			}
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
			int a2[] = {49,38,65,97,76,13,27,41,78};
			System.out.println("-------------------------开始排序--------------------------");
			_quickSort(a2, 0, a2.length - 1);
			
			System.out.println("-------------------------结束排序--------------------------");
			for (int i = 0; i < a2.length; i++) {
				System.out.print(a2[i]+" ");
			}
		}


}
