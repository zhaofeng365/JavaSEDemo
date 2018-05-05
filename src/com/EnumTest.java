package com;

public enum EnumTest{
    COLOR("",1),GREEN("",1),RED("",1),BLUE("",1);
	private EnumTest(String a,int b) {
		this.a = a;
		this.b = b;
	}
	private String a;
	private int b;
	
}

interface InterfaceTest{
	void show();
}
