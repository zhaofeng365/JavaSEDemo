package com;

import java.util.ArrayList;
import java.util.List;


public class TypicalCode {

	/**
	 * 判断是否是闰年
	 * @param year
	 * @return
	 */
	boolean isLeapYear(int year) {
		return (year%4 == 0 && year%100 !=0) || (year%400 == 0);
	}
	
	/**
	 * 判断一个数是否是质数。
	 * @param n n必须大于1
	 * @return
	 */
	boolean isPrimeNumber(int n) {
		int n1 = (int) Math.sqrt(n);
		for (int i = 2; i <= n1; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 分解质因数
	 * @param n
	 * @return
	 */
	Integer[] decPrime(int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i=2;i <= n;i++){
	        while(n != i){
	            if(n%i != 0){
	                break;
	            }
            	list.add(Integer.valueOf(i));
                n = n/i;
	        }
	    }
    	list.add(Integer.valueOf(n));
    	return list.toArray(new Integer[list.size()]);
	}
	
	/**
	 * 求最大公约数。辗除法。
	 * @param m
	 * @param n
	 * @return
	 */
	long gcd(long x,long y) {
		if(x < y) {
			long m = x;
			x = y;
			y = m;
		}
		long k = 0;
		while(y != 0) {
			k = x%y;
			x = y;
			y = k;
		}
		return  x;
	}

	/**
	 * 求最小公倍数
	 * @param x
	 * @param y
	 * @return
	 */
	long lcm(long x,long y) {
		return x*y/gcd(x,y);
	}
	
	/**
	 * 判断一个数是否是完数
	 * @param n
	 * @return
	 */
	boolean isPerfectNumber(long n) {
		int s = 0 ;
		for (int i = 1; i < n; i++) {
			if(n%i == 0) {
				s +=i;
			}
		}
		if( s == n) {
			return true;
		}
		return false;
	}
	
	/**
	 * 判读一个数是否是水仙数
	 * @param l
	 * @return
	 */
	boolean isDaffodilsNumber(long l) {
		char [] c = String.valueOf(l).toCharArray();
		int d = 0,n = c.length;
		long sum = 0;
		for (int i = 0; i < c.length; i++) {
			d = c[i]-'0';
			sum += Math.pow(d, n);
		}
		if(sum == l) {
			return true;
		}
		return false;
	}
	
	/**
	 * 判断是否是回文数字
	 * @param l
	 * @return
	 */
	boolean isPalindromeNumber(long l) {
		char [] c = String.valueOf(l).toCharArray();
		int len = c.length/2;
		for (int i = 0; i < len; i++) {
			if(c[i] != c[c.length-1-i]) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 求平方根
	 * @param d
	 * @param precision
	 * @return
	 */
	double sqrt(double d,double precision) {
		double x1 = d/2, x2 =(x1 + d/x1)/2;
		while(Math.abs(x2 -x1)>precision) {
			x1 = x2;
			x2 =(x1 + d/x1)/2;
		}
		return x1;
	}
	
	/**
	 * 奇偶数判断
	 * @param l
	 * @return
	 */
	boolean isOdd(long l) {
		if((l & 0x01) == 0) {
			return false;
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TypicalCode  test = new TypicalCode();
		
		System.out.println("=====1.闰年判断=====");
		System.out.print(test.isLeapYear(1996)+" ");
		System.out.print(test.isLeapYear(2000)+" ");
		System.out.print(test.isLeapYear(2004)+" ");
		System.out.println(test.isLeapYear(1900));
		
		System.out.println("=====2.质数=====");
		for (int i = 2; i < 101; i++) {
			if(test.isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		System.out.println("=====3.分解质因数=====");
		Integer[] ia = test.decPrime(36);
		for (int i = 0; i < ia.length; i++) {
			System.out.print(ia[i]+" ");
		}
		System.out.println();
		
		System.out.println("=====4.最大公约数=====");
		System.out.print(test.gcd(-36,-24)+" ");
		System.out.print(test.gcd(-32,8)+" ");
		System.out.println();
		
		System.out.println("=====5.最小公倍数=====");
		System.out.print(test.lcm(12,10)+" ");
		System.out.print(test.lcm(-32,8));
		System.out.println();
		
		System.out.println("=====6.完数=====");
		for (int i = 1; i < 1000; i++) {
			if(test.isPerfectNumber(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		System.out.println("=====7.水仙数=====");
		for (int l = 100; l < 1000; l++) {
			if(test.isDaffodilsNumber(l)) {
				System.out.print(l+" ");
			}
		}
		System.out.println();
		
		System.out.println("=====8.回文数字=====");
		int count =0;
		for (int l = 100; l < 10000; l++) {
			if(test.isPalindromeNumber(l)) {	
				if(++count%20 ==0) {
					System.out.println();//换行
				}
				System.out.print(l+" ");
			}
		}
		System.out.println();
		
		System.out.println("=====9.求平方根=====");
		System.out.print(test.sqrt(1.5, 1E-12)+" ");
		System.out.print(test.sqrt(3, 1E-12)+" ");
		System.out.print(test.sqrt(4, 1E-12)+" ");
		System.out.print(test.sqrt(5, 1E-12));
		System.out.println();
		
		System.out.println("=====10.奇偶数判断=====");
		System.out.print((test.isOdd(3)?"是奇数":"是偶数")+" ");
		System.out.print(test.isOdd(6)?"是奇数":"是偶数");
		
	}

}
