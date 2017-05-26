package com.designMode.Decorator;
public class FlyCar implements Car {

	public void show() {
		this.run();
		this.fly();
	}

	public void run() {
		System.out.println("������");
	}
	
	public void fly() {
		System.out.println("���Է�");
	}
}
