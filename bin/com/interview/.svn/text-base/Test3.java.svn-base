package com.interview;

import java.util.ArrayList;
import java.util.List;
/**
 * M选N全排列
 * @author Administrator
 *
 */
public class Test3 {
	    private static char[] array = new char[] { '1','3'};//数组
	    private static int total;
	    private static int number = 2;
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<Integer>();
	        plzh("", list,  number);
	         //plzh("",number);
	        System.out.println("total : " + total);
	    }
	    private static void plzh(String s, int number) {
	        if(number == 0) {
	            System.out.println(s);
	            total++;
	            return;
	        }
	        
	        for(int i = 0; i < array.length; i++) {
	        	System.out.println("S="+s+" I="+i+" Number="+number);
	                String str = s + array[i];
	                plzh(str, number-1);
	        }
	    }
	    
	    
	    
	    private static void plzh(String s, List<Integer> list, int number) {
	        if(number == 0) {
	            System.out.println(s);
	            total++;
	            return;
	        }
	        
	        List<Integer> list2 = null;
	        for(int i = 0; i < array.length; i++) {
	        	list2 = new ArrayList<Integer>();
	        	list2.addAll(list);
	        	
	            if(!list.contains(i)) {
	                String str = s + array[i];
	                list2.add(i);
	                
	                plzh(str, list2, number-1);
	            }
	        }
	    }
}
