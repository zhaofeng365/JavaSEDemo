package com.interview;

import java.util.Arrays;

public class InterviewTest {

	    /**
	     * 有两个有序整数集合a和b，写一个函数找出它们的交集？
	     * @param a
	     * @param b
	     * @return
	     */

	    public static int[] intersect(int[] a, int[] b) {
	    	//数组排序的，比较两数组中最大的与最小的是否有交集
	        if(a[0] > b[b.length - 1] || b[0] > a[a.length - 1]) {
	            return new int[0];
	        }
	        //定义一个数组
	        int[] intersection = new int[Math.max(a.length, b.length)];
	        int offset = 0;
	        for(int i = 0, s = i; i < a.length && s < b.length; i++) {//第一次循环a数组
	        	System.out.println("a.i的值是："+i+"  b.s的值是：" +s);
	            while(a[i] > b[s]) {//这里循环b数组
	                s++;
	            }
	            if(a[i] == b[s]) {
	                intersection[offset++] = b[s++];
	            }
	            while(i < (a.length - 1) && a[i] == a[i + 1]) {//判断a数组是否循环完全，并且相邻两数是否相等
	                i++;
	            }
	        }
	        if(intersection.length == offset) {
	            return intersection;
	        }
	        int[] duplicate = new int[offset];
	        System.arraycopy(intersection, 0, duplicate, 0, offset);
	        return duplicate;
	    }
	    
	    public static void main(String args[]){
	    	int[] a = {2, 3, 4, 4, 4, 4, 7, 8, 8, 8, 8, 9, 100, 130, 150,158, 160,161,162,163,164,165,166};
	        int[] b = {4, 6, 7, 7, 7, 7, 8, 8, 9, 10, 100, 130, 130, 140, 150,153,158,159};
	      //  int[] c = intersect(a, b);
	         int[] my = myIntersect(a,b);
	        //System.out.println(Arrays.toString(c));
	        System.out.println(Arrays.toString(my));
	    }
	    /**
	     * 查找两个数组的交集
	     * @param a
	     * @param b
	     * @return
	     */
		private static int[] myIntersect(int[] a, int[] b) {
			//判断数组是否为空
			if(a.length == 0 || b.length==0) {
				System.out.println("没有交集");
				return null;
			}
			
			//判断两个数组是否都是按顺序排列
			if(a.length>1 && a[0]>a[1]) {
				System.out.println("a数组为逆序，需要排列成正序");
				return null;
			}
			
			//判断两个数组是否都是按顺序排列
			if(b.length>1 && b[0]>b[1]) {
				System.out.println("b数组为逆序，需要排列成正序");
				return null;
			}
			
			//比较两个数组是否有交集
			if(a[0]>b[b.length-1] || b[0]>a[a.length-1]) {
				System.out.println("不存在交集");
				return null;
			}
			
			//定义一个接收交集的数组
			 int[] returnArray = new int[Math.max(a.length, b.length)];
			//int[] a = {2, 3, 4, 4, 4, 4, 7, 8, 8, 8, 8, 9, 100, 130, 150, 160,161,162,163,164,165,166};
		    //int[] b = {4, 6, 7, 7, 7, 7, 8, 8, 9, 10, 100, 130, 130, 140, 150,153,158,159};//18
			 int offset = 0;//定义接收交集数组的索引
			 int[] m,n;
			 if(a.length>b.length) {
				 System.out.println(" if ");
				 m = a;
				 n = b;
			 }else {
				 System.out.println(" else ");
				 m = b;
				 n = a;
			 }
			 
			//循环a数组
			for (int i = 0,s=0; i < m.length; i++) {
				
				while(s < n.length-1 && m[i]>n[s]) {
					s++;
				}
				
				if(s < n.length-1 && m[i]==n[s]) {
					returnArray[offset++] = n[s++];//offset++ 的作用，先设置交集数组的索引，再加1
				}
				
				while(i<m.length-1 && m[i]==m[i+1]) {
					i++;
				}
				
			}
			//这里做的目的是防止数组越界异常 
			if(returnArray.length == offset) {
	            return returnArray;
	        }
	        int[] duplicate = new int[offset];
	        System.arraycopy(returnArray, 0, duplicate, 0, offset);
			
			return duplicate;
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
