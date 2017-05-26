package com.throwtest;

public class Test {
  public static void main(String[] args) {
	  
	String s1 = new StringBuilder("go").append("od").toString();
	  
	System.out.println(s1.intern() == s1);
	
	String s2 = new StringBuilder("ja").append("va").toString();
	
	System.out.println(s1==s2); // false
	System.out.println(s1.equals(s2)); //true
	System.out.println(s2.intern() == s2);
	
	String s11 = "ab123" ;  
    String s22 = new String( "ab123" ) ;  
    System.out.println( s11 == s22 );   
    String s3 = s22.intern() ;   
    System.out.println( s11 == s3 ) ;   
}
}

class StaticTest {
	public static void main(String[] args) {
		st.print();
		new StaticTest().print();
		new StaticTest().print();
	}
	int mm = 0;
	private static StaticTest st = new StaticTest();
	private static int a;
	private static int b = 0;

	public StaticTest() {
		a++;
		b++;
	}

	public void print() {
		System.out.println("a=" + a + ",b=" + b);
	}

}
