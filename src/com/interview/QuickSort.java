package com.interview;

import java.util.Arrays;

public class QuickSort {

	//int a2[] = {49,38,65,97,76,13,27,41,78,34};//28
		public static int getMiddle(int[] list, int low, int high) {
		 
			int tmp = list[low]; // ����ĵ�һ����Ϊ����
			//���õ��Ƿ���˼��
			while (low < high) {
				
					while (low < high && tmp <= list[high]) {
						high--; //Ŀ�����ҳ�������С������
					}
					
					list[low] = list[high]; //������С�ļ�¼�Ƶ��Ͷ�
					
					while (low < high && tmp >= list[low]  ) {
						low++;//Ŀ�����ҳ�������������
					}
				 
					list[high] = list[low]; // �������ļ�¼�Ƶ��߶�
			}

			list[low] = tmp; // �����¼��β
			 
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
			//int a2[] = {1,4,75,34,22,67,43,2,3,18,1,9,21,43,54,22};//16��Ԫ��
			int a2[] = {1,4,75,34,22,67};//6��Ԫ��
			System.out.println("-------------------------����֮ǰ--------------------------"+Arrays.toString(a2));
			_quickSort(a2, 0, a2.length - 1);
			System.out.println("-------------------------����֮��--------------------------"+Arrays.toString(a2));
		 
		}


}
