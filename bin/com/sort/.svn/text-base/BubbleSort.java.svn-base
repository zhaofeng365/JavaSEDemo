package com.sort;

/**
 * ц╟ещеепР
 * @author Administrator
 *
 */
public class BubbleSort {

	private static void bubbleSort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length-1; j++) {
				int temp;
				if(arr[j]>arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {1,5,7,2,3,9,12,53,65,34,23};
		bubbleSort(arr);
	}
}
