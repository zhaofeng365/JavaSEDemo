package com.atguigu.day07.exer;

public class Girl {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void marry(Boy boy){
		System.out.println("��Ҫ�޸�" + boy.getName());
		boy.marry(this);
	}
}
