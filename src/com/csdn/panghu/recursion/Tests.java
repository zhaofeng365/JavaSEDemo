package com.csdn.panghu.recursion;

public class Tests {
	// 1 1 2 3 5
	public static void main(String[] args) {
		System.out.println(add(5));
	}
	
	public static int add(int m){
		if(m<=2){
			return 1;
		}else{
			return add(m-1)+add(m-2);
		}
		
	}
}
