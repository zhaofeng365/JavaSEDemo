package com.sort;
/**
 * 选择排序
 * @author Administrator
 *
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
