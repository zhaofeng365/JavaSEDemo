package com.interview;

public class QuickSort {

	//int a2[] = {49,38,65,97,76,13,27,41,78,34};//28
		public static int getMiddle(int[] list, int low, int high) {
			for (int i = 0; i < list.length; i++) {
				System.out.print(list[i]+" ");
			}
			System.out.println("");
			System.out.println("-------------------------BEGIN--------------------------");
			int tmp = list[low]; // ����ĵ�һ����Ϊ����
			while (low < high) {
				while (low < high && list[high] >= tmp) {
					high--;
				}
				list[low] = list[high]; // ������С�ļ�¼�Ƶ��Ͷ�
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
				list[high] = list[low]; // �������ļ�¼�Ƶ��߶�
				for (int i = 0; i < list.length; i++) {
					System.out.print(list[i]+" ");
					if(i==list.length-1){
						System.out.println();
					}
				}

			}

			list[low] = tmp; // �����¼��β
			for (int i = 0; i < list.length; i++) {
				System.out.print(list[i]+" ");
				if(i==list.length-1){
					System.out.println();
				}
			}
			return low; // ���������λ��

		}

		public static void _quickSort(int[] list, int low, int high) {

			if (low < high) {

				int middle = getMiddle(list, low, high); // ��list�������һ��Ϊ��

				_quickSort(list, low, middle - 1); // �Ե��ֱ���еݹ�����

				_quickSort(list, middle + 1, high); // �Ը��ֱ���еݹ�����

			}

		}

		public static void main(String[] args) {
			int a2[] = {49,38,65,97,76,13,27,41,78};
			System.out.println("-------------------------��ʼ����--------------------------");
			_quickSort(a2, 0, a2.length - 1);
			
			System.out.println("-------------------------��������--------------------------");
			for (int i = 0; i < a2.length; i++) {
				System.out.print(a2[i]+" ");
			}
		}


}
