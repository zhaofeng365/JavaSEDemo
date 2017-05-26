package com;

public class Test {
	public static void main(String[] args) {
		/**回文判断**/
		String text = "abcba";
		//System.out.println(isHuiwen(text));
		/**数据类型转换**/
		String a = "32465";
		System.out.println(convert_num(a));
		/***二分查找(指定key在有序数组中的索引)**/
		int[] intArr = new int[]{1,2,3,4,5,6,7,9,10,29};
		int key = 11;
		binarySearch(intArr,key);
		System.out.println(System.nanoTime());
		
		float f=3.4f;
		short s1 = 1; 
	}
	
	
	/**
	 * 二分查找
	 * @param intArr
	 * @param key
	 */
	private static void binarySearch(int[] intArr, int key) {
		if(intArr==null || intArr.length==0){
			System.out.println("异常,请正确传入参数");
			return;
		}
		if(intArr[intArr.length-1]<key || intArr[0]>key){
			System.out.println("该KEY不包含在该数组中");
			return;
		}
		int low=0,high=intArr.length-1,middle=0;
			
		while(low<high){
		   middle = (low+high+1)/2;
		   if(intArr[middle]==key){
			   System.out.println("KEY值的索引是"+middle);
			   return;
		   }else if(intArr[middle]<key){
			   low = middle;
		   }else if(intArr[middle]>key){
			   high = middle;
		   }
		   if(high-low==1){
			   System.out.println("该值不在区间");
			   break;
		   }
		}
		
	}

	/**
	 * 判断是否为回文
	 * 
	 * @param text
	 * @return
	 */
	public static boolean isHuiwen(String text) {
		int length = text.length();
		for (int i = 0; i < length / 2; i++) {
			if (text.charAt(i) != text.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 把一组数字 字符串转化成数字
	 */

	public static int convert_num(String val) {

		int return_val = 0;
		char[] char_arr = val.toCharArray();
		//32465
		for (int i = 0; i < char_arr.length; i++) {
			char c = char_arr[i];
			// 例如： 100 = 10 *10
			int val_v = (int) Math.pow(10, char_arr.length - (i + 1));
			return_val = return_val + (c - 48) * val_v;
		}
		return return_val;
	}
}
