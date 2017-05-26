package com;

public class Test {
	public static void main(String[] args) {
		/**�����ж�**/
		String text = "abcba";
		//System.out.println(isHuiwen(text));
		/**��������ת��**/
		String a = "32465";
		System.out.println(convert_num(a));
		/***���ֲ���(ָ��key�����������е�����)**/
		int[] intArr = new int[]{1,2,3,4,5,6,7,9,10,29};
		int key = 11;
		binarySearch(intArr,key);
		System.out.println(System.nanoTime());
		
		float f=3.4f;
		short s1 = 1; 
	}
	
	
	/**
	 * ���ֲ���
	 * @param intArr
	 * @param key
	 */
	private static void binarySearch(int[] intArr, int key) {
		if(intArr==null || intArr.length==0){
			System.out.println("�쳣,����ȷ�������");
			return;
		}
		if(intArr[intArr.length-1]<key || intArr[0]>key){
			System.out.println("��KEY�������ڸ�������");
			return;
		}
		int low=0,high=intArr.length-1,middle=0;
			
		while(low<high){
		   middle = (low+high+1)/2;
		   if(intArr[middle]==key){
			   System.out.println("KEYֵ��������"+middle);
			   return;
		   }else if(intArr[middle]<key){
			   low = middle;
		   }else if(intArr[middle]>key){
			   high = middle;
		   }
		   if(high-low==1){
			   System.out.println("��ֵ��������");
			   break;
		   }
		}
		
	}

	/**
	 * �ж��Ƿ�Ϊ����
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
	 * ��һ������ �ַ���ת��������
	 */

	public static int convert_num(String val) {

		int return_val = 0;
		char[] char_arr = val.toCharArray();
		//32465
		for (int i = 0; i < char_arr.length; i++) {
			char c = char_arr[i];
			// ���磺 100 = 10 *10
			int val_v = (int) Math.pow(10, char_arr.length - (i + 1));
			return_val = return_val + (c - 48) * val_v;
		}
		return return_val;
	}
}
