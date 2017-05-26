package com;

public class ClassLoaderOrder {
	public static int k = 0;
	public static ClassLoaderOrder t1 = new ClassLoaderOrder("t1");
	public static ClassLoaderOrder t2 = new ClassLoaderOrder("t2");
	public static int i = print("i");
	public static int n = 99;
	public int j = print("j");

	{
		print("构造块");
	}

	static {
		print("静态块");
	}

	public ClassLoaderOrder(String str) {
		System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
		++i;
		++n;
	}

	private static int print(String str) {
		System.out.println((++k) + ":" + str + "   i=" + i + "   n=" + n);
		++n;
		return ++i;
	}
	/** 
	 *   
	 *  1 程序从main函数开始执行 ,执行main函数，需要先加载class文件 
	 *  2 加载class文件的同时，同时初始化static成员变量和static块，执行顺序为从上到下依次执行 
	 *  3 加载class完成之后，初始化成员变量。注：普通代码块，可以看作成员变量，执行顺序为从上到下依次执行 
	 *  4 上面的过程完成之后，再从main函数的第一条语句开始执行。 
	 *  5 注：静态成员变量和静态代码块只会 在加载class文件的时候 执行一次 
	 */  
	public static void main(String[] args) {
		ClassLoaderOrder t = new ClassLoaderOrder("init");

		ClassLoaderOrder t2 = new ClassLoaderOrder("init2");

	}
}
