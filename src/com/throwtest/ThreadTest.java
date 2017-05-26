package com.throwtest;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest {
	static List<int[]> allSorts = new ArrayList<int[]>();

	public static void permutation(int[] nums, int start, int end) {
		if (start == end) { // 当只要求对数组中一个数字进行全排列时，只要就按该数组输出即可
			int[] newNums = new int[nums.length]; // 为新的排列创建一个数组容器
			for (int i = 0; i <= end; i++) {
				newNums[i] = nums[i];
			}
			allSorts.add(newNums); // 将新的排列组合存放起来
		} else {
			for (int i = start; i <= end; i++) {
				int temp = nums[start]; // 交换数组第一个元素与后续的元素
				nums[start] = nums[i];
				nums[i] = temp;
				permutation(nums, start + 1, end); // 后续元素递归全排列
				nums[i] = nums[start]; // 将交换后的数组还原
				nums[start] = temp;
			}
		}
	}

	/*
	 * public static void main(String[] args) { int[] numArray = {1, 2};
	 * permutation(numArray, 0, numArray.length - 1); int[][] a = new
	 * int[allSorts.size()][]; // 你要的二维数组a allSorts.toArray(a);
	 * 
	 * // 打印验证 for (int i=0; i<a.length; i++) { int[] nums = a[i]; for (int j=0;
	 * j<nums.length; j++) { System.out.print(nums[j]); } System.out.println();
	 * } System.out.println(a.length); }
	 */

	public static void main(String[] args) {
        int testArray[] = new int[] { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < testArray.length; i++) {
            int b = testArray[i];
            int c = 0;
            int sum = 0;
            while (b > 0) {
                c = b % 10;
                if (c == 4) {
                    sum++;
                    break;
                }
                b /= 10;
            }
            if (sum == 0) {
                if (i == testArray.length - 1) {
                    result.append(testArray[i]);
                } else {
                    result.append(testArray[i]).append(",");
                }
            }
        }
        System.out.println(result.toString());
    }
}
