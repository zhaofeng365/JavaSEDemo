package com.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SynchnorizedClass implements child{
      
	 public static void main(String[] args) throws ClassNotFoundException {
		 CopyOnWriteArraySet<String> co = new CopyOnWriteArraySet<String>();
		 HashSet<String> hashset = new HashSet<String>();
		 Hashtable<String,String> table = new Hashtable<String,String>();
		 Map<String, String> map = new HashMap<String, String>();
		 List<String> list = new ArrayList<String>();
		 map.put("1","11111");
		 map.put("2","22222");
		 map.put("3","33333");
		 map.put("1","44444");
		 System.out.println("hashCode = "+ hash(15));
		 
		 for (Entry<String,String> entry: map.entrySet()) {
			
			 System.out.println(entry.getKey()+" "+entry.getValue());
		}
		 	
		ClassLoader loader = SynchnorizedClass.class.getClassLoader();
		 System.out.println(loader.getClass());
		 
		 System.out.println(Class.forName("java.lang.String").getClassLoader());
		 
		 StringBuffer sb = new StringBuffer();
		 
		 StringBuilder sbd = new StringBuilder();
		 
		 Queue<Object> msgQueue = new LinkedList<Object>();
		 
		 ArrayList<String> arrayList1=new ArrayList(); //��һ�� ���
		 
		 ArrayList arrayList2=new ArrayList<String>();//�ڶ��� ���  
		 arrayList1.add("323");
		 //arrayList1.add(234234);
		 arrayList2.add("32sdf3");
		 arrayList2.add(12312);
	}
	   static int hash(int h) {
	         h ^= (h >>> 20) ^ (h >>> 12);
	         return h ^ (h >>> 7) ^ (h >>> 4);
	     }
	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	 
	
}
interface child extends Interfaces{
	@Override
	public void add();
	public void get();
}
 interface Interfaces{
	public void add();
}
 
 abstract class AbstractClass extends ImplClass{
	 public void add(){
		 
	 }
	 public abstract void get();
 }
 class ImplClass{
	 /***��ת**/
	 public void meee() {
		// TODO Auto-generated method stub

	}
	 public static String reverse(String originStr) {
		 System.out.println(originStr.charAt(0));
        if(originStr == null || originStr.length() <= 1) 
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
	 public static void main(String[] args) {
		String a = reverse("9876543210");
		System.out.println(a);
	}
 }
 
 class ThreadCall implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("11111111");
		return 111;
	}
	ExecutorService service = Executors.newFixedThreadPool(10);
	 
 }
 
