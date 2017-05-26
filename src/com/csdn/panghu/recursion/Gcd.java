package com.csdn.panghu.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Description: [递归求解gcd欧几里德算法]
 * @Author: [胖虎]
 * @CreateDate: [2014-3-31 下午10:51:47]
 * @CsdnUrl: [http://blog.csdn.net/ljphhj]
 */
public class Gcd {

	public static int gcd(int m, int n) {
		/* 递归终结条件 */
		if (n == 0) {
			return m;
		}
		/* 递归调用 */
		return gcd(n, m % n);
	}

	public static void main(String[] args) {
		//System.out.println(Gcd.gcd(6, 4));

		int n = 10;
		System.out.println(n + "年后共有" + cattle(n) + "头牛");

		//bings();
		
		//zishu();
		heshu();
	}

	public static int cattle(int n) {
		if (n <= 0) {
			return 0;
		} else if (n <= 3) {
			return 1;
		} else {
			return cattle(n - 1) + cattle(n - 3);
		}
	}

	public static String bings() {
		String str = "教练教练裁判裁判裁判运动员运动员";

		List<String> data = new ArrayList<String>();

		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i + 1);
			if (!data.contains(s)) {
				data.add(s);
			}
		}

		String result = "";
		for (String s : data) {
			result += s;
		}
		System.out.println(result);
		return result;
	}
	/**
	 * 输出质数（只能被1和他本身整除的数）
	 */
	public static void zishu() {
		int j;
		// 1不是素数，所以直接从2开始循环
		for (int i = 2; i <= 100; i++){
			j = 2;
			while (i % j != 0) {
				j++; // 测试2至i的数字是否能被i整除，如不能就自加
			}
			// 当有被整除的数字时，判断它是不是自身
			if (j == i){
				System.out.println(i); // 如果是就打印出数字
			}
		}
	}
	/**
	 * 输出合数（能被1和他本身之外整除的数）
	 */
	public static void heshu() {
		int j;
		// 1不是素数，所以直接从2开始循环
		for (int i = 2; i <= 100; i++){
			j = 2;
			while(i % j != 0) {
				j++; // 测试2至i的数字是否能被i整除，如不能就自加
			}
			// 当有被整除的数字时，判断它是不是自身
			if (j != i){
				System.out.println(i); // 如果是就打印出数字
			}
		}
	}

}
