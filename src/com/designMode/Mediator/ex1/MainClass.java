package com.designMode.Mediator.ex1;

 

public class MainClass {
	public static void main(String[] args) {
		Person zhangsan = new Man("����",5);
		Person lisi = new Man("����",6);
		
		Person xiaofang = new Woman("С��", 6);
		
		zhangsan.getPartner(xiaofang);
		lisi.getPartner(xiaofang);
		zhangsan.getPartner(lisi);
		
	}
}	
