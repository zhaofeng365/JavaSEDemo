package com.interview;

public class StringTest {
	public static void main(String[] args) {
		/**
		 * 分析：用new String()创建的字符串不是常量，不能在编译期就确定，所以new String() 创建的字符串不放入常量池中，它们有自己的地址空间。
	   s0还是常量池 中"kvill”的应用，s1因为无法在编译期确定，所以是运行时创建的新对象”kvill”的引用，s2因为有后半部分 new String(”ill”)
	   所以也无法在编译期确定，所以也是一个新创建对象”kvill”的应用;明白了这些也就知道为何得出此结果了。
		 * @param args
		 */
		String s0 = "kvill";

		String s1 = new String("kvill");

		String s2 = "kv" + new String("ill");

		System.out.println(s0 == s1);

		System.out.println(s0 == s2);

		System.out.println(s1 == s2);

		
		/**
		 * 分析：JVM对于字符串引用，由于在字符串的"+"连接中，有字符串引用存在，而引用的值在程序编译期是无法确定的，
		 * 即"a" + bb无法被编译器优化，只有在程序运行期来动态分配并将连接后的新地址赋给b。所以上面程序的结果也就为false。
		 */
		String a = "ab";

		String bb = "b";

		String b = "a" + bb;
		double c = .123;
		System.out.println((a == b)); //result = false
		System.out.println("cccccc "+c);
		/**
		 * 分析：和[4]中唯一不同的是bb字符串加了final修饰，对于final修饰的变量，它在编译时被解析为常量值的一个本地拷贝存储到自己的常量 
		 * 池中或嵌入到它的字节码流中。所以此时的"a" + bb和"a" + "b"效果是一样的。故上面程序的结果为true。
		 */
		String a1 = "ab";

		final String bb1 = "b";

		String b1 = "a" + bb1;

		System.out.println((a1 == b1)); //result = true
		
		
		/**
		 * 步骤： 
		1) 栈中开辟一块中间存放引用s1，s1指向池中String常量"a"， 
		2) 栈中开辟一块中间存放引用s2，s2指向池中String常量"b"， 
		3) 栈中开辟一块中间存放引用str5， 
		4) s1 + s2通过StringBuilder的最后一步toString()方法还原一个新的String对象"ab"，因此堆中开辟一块空间存放此对象， 
		5) 引用str6指向堆中(s1 + s2)所还原的新String对象， 
		6) str6指向的对象在堆中，而常量"ab"在池中，输出为false
		 */
		String s11 = "a"; 
	    String s21 = "b"; 
	    String str6 = s11 + s21; 
	    String str7 = "a"+"b";
	    System.out.println(str6 == "ab");
	    System.out.println(str7=="ab");
	}
	
	/**
	 * 分析：JVM对于字符串引用bb，它的值在编译期无法确定，只有在程序运行期调用方法后，
	 * 将方法的返回值和"a"来动态连接并分配地址为b，故上面 程序的结果为false。
	 */
	public void func(){
		String a = "ab";

		final String bb = getBB();

		String b = "a" + bb;

		System.out.println((a == b)); //result = false

	}
	private static String getBB() {  
		return "b"; 
	}
	
	 
}
