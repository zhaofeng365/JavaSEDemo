package com.throwtest;

public class ChildClass extends SuperClass{
	private String name;
	public String mobile;
	public String getName() {
		
		return "child Name";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		super.getName();
		super.getMobile();
		return "child mobile";
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public static void main(String[] args) {
		System.out.println(new ChildClass().getMobile());
		System.out.println(new ChildClass().getName());
	}
}
