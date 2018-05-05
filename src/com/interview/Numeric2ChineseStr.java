package com.interview;

import java.io.BufferedReader;
import java.io.FileReader;

public class Numeric2ChineseStr {

	public static void main(String[] args) throws Exception {
		String fileName = "c:\\input.txt";

		// 单位数组
		String[] units = new String[] { "十", "百", "千", "万", "十", "百", "千", "亿" };

		// 中文大写数字数组
		String[] numeric = new String[] { "零", "壹", "贰", "叁", "肆", "伍", "陆","柒", "捌", "玖" };

		// 读文件
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String temp = null;
		temp = br.readLine();//读取一行
		String res = "";

		while (null != temp) {
			// 遍历一行中所有数字
			for (int k = -1; temp.length() > 0; k++) {
				// 解析最后一位
				int j = Integer.parseInt(temp.substring(temp.length() - 1, temp.length()));
				String rtemp = numeric[j];

				// 数值不是0且不是个位 或者是万位或者是亿位 则去取单位
				if (j != 0 && k != -1 || k % 8 == 3 || k % 8 == 7) {
					rtemp += units[k % 8];
				}

				// 拼在之前的前面
				res = rtemp + res;

				// 去除最后一位
				temp = temp.substring(0, temp.length() - 1);
			}

			// 去除后面连续的零零..
			while (res.endsWith(numeric[0])) {
				res = res.substring(0, res.lastIndexOf(numeric[0]));
			}

			// 将零零替换成零
			while (res.indexOf(numeric[0] + numeric[0]) != -1) {
				res = res.replaceAll(numeric[0] + numeric[0], numeric[0]);
			}

			// 将 零+某个单位 这样的窜替换成 该单位 去掉单位前面的零
			for (int m = 1; m < units.length; m++) {
				res = res.replaceAll(numeric[0] + units[m], units[m]);
			}

			// 这里打印一下 可以改成写文件
			System.out.println(res);

			// 读取下一个数
			res = "";
			temp = br.readLine();
		}
	}
}
