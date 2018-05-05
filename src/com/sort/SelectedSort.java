package com.sort;
/**
 * 选择排序
 * @author Administrator
 *选择排序的思想是，每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。
 */
public class SelectedSort {
 
	private static void selectedSort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int index=i;
			int temp = 0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[index] > arr[j]){
					index = j ; //找出最小数
				}
			}
			//元素交换
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {39,11,34,5,12,2,7,9,0};
		selectedSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
