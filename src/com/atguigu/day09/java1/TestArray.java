package com.atguigu.day09.java1;

public class TestArray {
	public static void main(String[] args) {
		int[] arr = new int[]{12,4,76,0,-98,-54,4,100};
		
		int max = ArrayUtil.getMax(arr);
		System.out.println("���ֵΪ��" + max);
		
		int avg = ArrayUtil.avg(arr);
		System.out.println("ƽ��ֵΪ��" + avg);
		
		ArrayUtil.printArray(arr);
		
		System.out.println("��ת���飺");
		ArrayUtil.reverse(arr);
		
		ArrayUtil.printArray(arr);
		
		System.out.println("����������");
		ArrayUtil.sort(arr,"asc");
		
		ArrayUtil.printArray(arr);
		
	}
}
