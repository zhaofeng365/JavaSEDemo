package com.math;

import java.util.Scanner;

/**
 * 
 * @author Administrator ����һ����N��ӡN��N�����ÿ��ÿ���Լ��Խ��ߵĺͶ�һ��
 */
public class NinePalace {
	static int[][] nine = new int[3][3];
	static boolean[] used = new boolean[10];

	public static void main(String[] args) {

		for (int i = 0; i < 10; ++i) {
			used[i] = true;
		}

		dfs(0);

	}

	public static void dfs(int step) {
		if (step == 9) {
			if (check() == true) {
				for (int i = 0; i < 3; ++i) {
					for (int j = 0; j < 3; ++j) {
						System.out.print(nine[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println("===========");
			}
		}

		for (int i = 1; i <= 9; ++i) {
			if (used[i] == true) {
				used[i] = false;
				nine[step / 3][step % 3] = i;
				dfs(step + 1);
				used[i] = true;
			}
		}
	}

	public static boolean check() {
		int[] sum_i = new int[3];
		for (int i = 0; i < 3; ++i) {
			sum_i[i] = 0;
			for (int j = 0; j < 3; ++j) {
				sum_i[i] += nine[i][j];
			}
		}
		if (sum_i[0] != sum_i[1] || sum_i[1] != sum_i[2]
				|| sum_i[0] != sum_i[2])
			return false;

		int[] sum_j = new int[3];
		for (int j = 0; j < 3; ++j) {
			sum_j[j] = 0;
			for (int i = 0; i < 3; ++i) {
				sum_j[j] += nine[i][j];
			}
		}
		if (sum_j[0] != sum_j[1] || sum_j[1] != sum_j[2]
				|| sum_j[0] != sum_j[2])
			return false;

		int sum1 = nine[0][0] + nine[1][1] + nine[2][2];

		if (sum_i[0] != sum1)
			return false;

		int sum2 = nine[1][1] + nine[0][2] + nine[2][0];

		if (sum_i[0] != sum2)
			return false;

		return true;
	}

}

/** ��java ��̽�һ��N*N�ľ��󣬶Խ�����Ԫ����Ϊ1��������Ϊ0 **/
class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����n��");
		int n = scanner.nextInt();
		int numarr[][] = new int[n][n];

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				if ((j == k) || (j + k) == (n - 1)) {
					numarr[j][k] = 1;
				} else {
					numarr[j][k] = 0;
				}
			}
		}

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				System.out.print("arr[" + j + "][" + k + "]=" + numarr[j][k]
						+ "  ");
			}
			System.out.println();
		}
	}
}
/**��һ�����������������ĺ�**/
class Test1 {

	public static void main(String[] args) {
		int[] array = {-10, -9, -3, -3, -5, -1, -7, -19};
		findMaxSum(array);
	}

	// �������������
	public static void findMaxSum(int[] data) {
		int len;
		if (null == data || (len = data.length) == 0) {
			return;
		}
		
		/*int curSum = 0;
		int maxSum = 0;
		
		int curValue;
		int maxValue = data[0];
		
		int startPoint = 0;
		int endPoint = 0;
		
		for (int i = 0; i < len; i++) {
			curValue = data[i];
			
			if (curValue > maxValue) {
				maxValue = curValue;
			}
			
			curSum += curValue;
			if (curSum < 0) {
				curSum = 0;
			}
			
			if (curSum > maxSum) {
				maxSum = curSum;
			}
		}
		
		// ���ȫ�Ǹ�������sum=���ֵ
		if (maxValue < 0) {
			maxSum = maxValue;
		}
		System.out.println("maxSunSum=" + maxSum);
		System.out.println("point=" + startPoint + " ��  " + endPoint);
		*/
		
		int max = data[0];//ȫ����������������  
		int sum = 0;
		for (int k = 0; k < len; k++) {
			if(sum>=0){
				sum+=data[k];//�������ĳ��Ԫ�أ�sum>=0�Ļ����ͼ� 
			}else{
				sum=data[k];//�������ĳ��Ԫ�أ�sum<0�ˣ��Ͳ��� 
			}
			if(sum>max){
				max=sum;
			}
		}
		System.out.println(max);
		
	}
}
