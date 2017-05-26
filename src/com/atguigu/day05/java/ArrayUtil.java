package com.atguigu.day05.java;

public class ArrayUtil {
	// ����������ֵ
	public int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// ���������Сֵ
	public int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	// ��������Ԫ��
	public void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("]");
	}

	// �������ƽ����
	public int avg(int[] arr) {
		int sum = getSum(arr);
		return sum / arr.length;
	}

	// ��������ܺ�
	public int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// ����ķ�ת
	public int[] reverse(int[] arr) {
		for (int x = 0, y = arr.length - 1; x < y; x++, y--) {
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		return arr;
	}
	public int[] reverses(int[] arr){
		for (int y = 0; y < arr.length/2; y++) {
				int temp = arr[y];
				arr[y] = arr[arr.length-1-y];
				arr[arr.length-1-y] = temp;
		}
		
		return arr;
	}

	// ʵ������ĸ���
	public int[] copy(int[] arr) {
		// int[] arr1 = arr;
		// return arr1;
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}

	// �������������
	public static void sort(int[] arr, String desc) {
		if (desc == "asc") {// ascend:��С����
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						swap(arr,j,j+1);
						//swap(arr[j],arr[j + 1]);
					}
				}
			}
		} else if (desc == "desc") {// �Ӵ�С
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] < arr[j + 1]) {
						swap(arr,j,j+1);
						System.out.println(arr[j]+"  "+arr[j+1]);
						//swap(arr[j],arr[j + 1]);
					}
				}
			}
		} else {
			System.out.println("�����������ʽ����");
		}
	}
	public static void main(String[] args) {
		int[] mm = new int[]{1,3,4,2,6,9,8,7,5};
		sort(mm,"desc");
	}
	//����������ָ��λ�õ�Ԫ��:����arr����������Ϊi��j������Ԫ��
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
//	public void swap(int i,int j){
//		int temp = i;
//		i = j;
//		j = temp;
//	}
}
