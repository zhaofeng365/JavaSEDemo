package com;

public class SingleInstall {

	private SingleInstall(){
		
	}
	private static SingleInstall install = new SingleInstall();
	
	public static SingleInstall getInstall(){
		return install;
	}
	public static void main(String[] args) {
		 System.out.println(computeAge(4));
	}
	 public static int computeAge(int n) {
	       // return n == 1 ? 10 : computeAge(n - 1) + 2;
	        // ��������Ŀ��������Ĵ���Ҳ����
		 System.out.println(n);
	               if (n == 1) {
	                   return 10;
	               } else {
	                   return computeAge(n - 1) + 2;
	               }
	    }
	
}
