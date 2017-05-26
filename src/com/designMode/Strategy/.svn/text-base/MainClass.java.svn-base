package com.designMode.Strategy;
public class MainClass {
	public static void main(String[] args) {
		Strategy stra = new MDSStrategy();
		stra.encrypt();
		
		Context context = new Context(new MDSStrategy());
		context.encrypt();
		
		
		Context context1 = new Context(new MD5Strategy());
		context1.encrypt();
		
		
	}
}
