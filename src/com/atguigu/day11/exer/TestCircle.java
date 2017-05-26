package com.atguigu.day11.exer;

/*
 * ����һ���ӿ�����ʵ����������ıȽϡ�
 interface CompareObject{
 public int compareTo(Object o);   //������ֵ�� 0 , �������; ��Ϊ����������ǰ����󣻸�������ǰ����С
 }
 ����һ��Circle�ࡣ

 ����һ��ComparableCircle�࣬�̳�Circle�ಢ��ʵ��CompareObject�ӿڡ�
 ��ComparableCircle���и����ӿ��з���compareTo��ʵ���壬�����Ƚ�����Բ�İ뾶��С��

 ����һ��������TestCircle����������ComparableCircle����
 ����compareTo�����Ƚ�������İ뾶��С��

 */
public class TestCircle {
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(2.3);
		ComparableCircle c2 = new ComparableCircle(2.1);
		ComparableCircle c3 = new ComparableCircle(2.3);
		
		int i1 = c1.compareTo(c2);
		int i2 = c1.compareTo(c3);
		int i3 = c2.compareTo(c1);
		System.out.println(i1);//1
		System.out.println(i2);//0
		System.out.println(i3);//-1
		int i4 = c1.compareTo(new String());
	}
}

interface CompareObject {
	int compareTo(Object o);
}

class Circle {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class ComparableCircle extends Circle implements CompareObject {
	public ComparableCircle(double radius){
		super(radius);
	}
	public int compareTo(Object o) {
		if (this == o) {
			return 0;
		} else if (o instanceof ComparableCircle) {
			ComparableCircle c = (ComparableCircle) o;
			if (this.getRadius() > c.getRadius()) {
				return 1;
			} else if (this.getRadius() < c.getRadius()) {
				return -1;
			} else {
				return 0;
			}
		} else {
			// return -2;
			throw new RuntimeException("����ķ�ComparableCircle�Ķ��󣬲��ɽ��бȽ�");
		}
	}

}