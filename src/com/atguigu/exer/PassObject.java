package com.atguigu.exer;
/*
 * ��1������һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��
 * һ��findArea()��������Բ�������
��2������һ����PassObject�������ж���һ������printAreas()���÷����Ķ������£�
		public void printAreas(Cirlce c, int time)
��printAreas�����д�ӡ���1��time֮���ÿ�������뾶ֵ���Լ���Ӧ�������
���磬timesΪ5��������뾶1��2��3��4��5���Լ���Ӧ��Բ�����
��main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ��


1.���������:��������Ķ����������ġ�
    1��������ֻ��Ҫһ�ε�����Ķ���ʱ�����ǾͿ��Կ���ʹ�������ķ�ʽ������Ķ���
    2���ص㣺������������Ķ���ֻ�ܹ�����һ�Σ�
 */
class Circle{
	double radius;
	
	public double findArea(){
		return Math.PI * radius * radius;
		//return Math.PI * getRadius() * getRadius();
	}
	
	public void setRadius(double r){
		radius = r;
	}
	public double getRadius(){
		return radius;
	}
	public void show(){
		System.out.println("����һ��Բ");
	}
}

public class PassObject {
	public void printAreas(Circle c, int time){
		System.out.println("Radius" + "\t\t" + "Area");
//		int temp = 0;
//		for(int i = 1;i <= time;i++,temp = i){
//			c.setRadius(i);
//			System.out.println(c.getRadius() + "\t\t" + c.findArea());
//		}
		//c.setRadius(temp);
		int i = 1;
		while(i <= time){
			c.setRadius(i);
			System.out.println(c.getRadius() + "\t\t" + c.findArea());
			i++;
		}
		c.setRadius(i);
	}
	public static void main(String[] args) {
		PassObject p = new PassObject();
		Circle c = new Circle();//��ʱc�İ뾶Ϊ0
		p.printAreas(c, 5);
		
		System.out.println("now radius is " + c.getRadius());
		System.out.println();
		
		p.printAreas(new Circle(), 6);
		//System.out.println("now radius is " + c.getRadius());
		
		
		new Circle().show();
		
		new Circle().setRadius(2.3);
		
		
	}
}
