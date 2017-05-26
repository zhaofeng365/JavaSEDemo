package com.interview;

import java.util.ArrayList;
/**
 * 全排列算法，任意排列1,2,3,4,5个数的随意组合。
 * 
 */
 //方法一：
public class Arrange {

	private int total = 0;
	private ArrayList arrangeList = new ArrayList();

	public Arrange() {
	}

	private void swap(String list[], int k, int i) {
		String c3 = list[k];
		list[k] = list[i];
		list[i] = c3;
	}

	public void perm(String list[], int k, int m) {
		if (k > m) {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i <= m; i++) {
				sb.append(list[i]).append(",");
			}
			if (sb.length()>0) {
				sb.setLength(sb.length()-1);
			}
			arrangeList.add(sb.toString());
			total++;
		} 
		else {
			for (int i = k; i <= m; i++) {
				swap(list, k, i);
				perm(list, k + 1, m);
				swap(list, k, i);
			}
		}
	}

	public int getTotal() {
		return total;
	}
	
	public ArrayList getArrangeList() {
		return arrangeList;
	}

	public static void main(String args[]) {
		String list[] = { "1", "2"};
		Arrange ts = new Arrange();
		ts.perm(list, 0, list.length-1);
		for (int i = 0; i < ts.getArrangeList().size(); i++) {
			System.out.println(ts.getArrangeList().get(i));
		}
		System.out.println("total:" + ts.total);
	}

}




//方法2：

  class TestQuestion {
	static int[] bits = new int[] { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		sort("", bits);
	}
	
	private static void sort(String prefix, int[] a) {
		if (a.length == 1) {
			System.out.println(prefix + a[0]);
		}
		for (int i = 0; i < a.length; i++) {
			sort(prefix + a[i], copy(a, i));
		}
	}
	
	private static int[] copy(int[] a,int index){
		int[] b = new int[a.length-1];
		System.arraycopy(a, 0, b, 0, index);
		System.arraycopy(a, index+1, b, index, a.length-index-1);
		return b;
	}
}