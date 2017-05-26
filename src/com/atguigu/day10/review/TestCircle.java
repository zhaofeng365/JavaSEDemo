package com.atguigu.day10.review;


public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.3);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(Circle.getTotal());
	}
}

class Circle{
	private double radius;
	private static String info = "����һ��Բ";
	private int id;//���
	private static int init = 1001;//����ÿ�������id
	private static int total = 0;//��¼�����˶��ٸ�����
	
	public Circle(){
		this.id = init++;
		total++;
	}
	public Circle(double radius){
		this.radius = radius;
		this.id = init++;
		total++;
	}
	
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static String getInfo() {
		return info;
	}
	public static void setInfo(String info) {
		Circle.info = info;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Circle.total = total;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", id=" + id + "]";
	}
	public static void show(){
		System.out.println(Circle.info);
	}
	
	public void desc(){
		System.out.println(this.info);
	}
	
	
}
