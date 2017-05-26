package com.atguigu.day08.exer1;

 

public class Circle extends GeometricObject{
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius,String color,double weight){
		super(color,weight);
		this.radius =radius;
	}
	
	public double findArea(){
		return Math.PI * radius * radius;
	}
	
}
