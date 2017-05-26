package com;

import java.util.Arrays;

public class IntegerTest {
	 public static void main(String[] args) {     
	        objPoolTest(); 
	    } 
	 
	    public static void objPoolTest() { 
	        Integer i1 = 40; 
	        Integer i2 = 40; 
	        Integer i3 = 0; 
	        Integer i4 = new Integer(40); 
	        Integer i5 = new Integer(40); 
	        Integer i6 = new Integer(0); 
	        System.out.println("i1=i2\t" + (i1 == i2)); 
	        System.out.println("i1=i2+i3\t" + (i1 == i2 + i3)); 
	        System.out.println("i4=i5\t" + (i4 == i5)); 
	        System.out.println("i4=i5+i6\t" + (i4 == i5 + i6));     
	         
	        System.out.println();  
	        
	        String a =  "b" ;   
	        String b =  "b" ;   
	          
	        System.out.println( a == b);   
	          
	        String c = "d" ;  
	        String d = new String( "d" ).intern() ;   
	        System.out.println( c == d);  
	        
	        String s1 = "ab123" ;  
	        String s2 = new String( "ab123" ) ;  
	        System.out.println( s1 == s2 );   
	        String s3 = s2.intern() ;   
	        System.out.println( s1 == s3 ) ;  
	        
	        final String[] arr = new String[]{"9","1","2","4","5","3","8","10","12"};
	        arr[1]="43";
	        Arrays.sort(arr);
	        for (String string : arr) {
				System.out.print(string+"\t");
			}
	        Object o = new Object();
	    } 
}
