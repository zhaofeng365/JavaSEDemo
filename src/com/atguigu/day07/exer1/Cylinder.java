package com.atguigu.day07.exer1;

public class Cylinder extends Circle {
	private double length;// Բ���ĸ�

	public Cylinder() {
		length = 1;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	// ��д����Circle�ķ�������Բ���ı����
	public double findArea() {
		// return 3.14 * this.getRadius() * this.getRadius() * 2 + 2 * 3.14
		// * this.getRadius() * this.length;
		return super.findArea() * 2 + 2 * 3.14 * this.getRadius() * this.length;
	}

	// Բ�������
	public double findVolume() {
		//return Math.PI * this.getRadius() * this.getRadius() * length;
		 return super.findArea() * length;
	}

}
