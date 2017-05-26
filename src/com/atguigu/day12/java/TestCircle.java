package com.atguigu.day12.java;

//1.�ֶ����׳�һ���쳣������
//2.�׳����쳣���ͣ�����RuntimeException�����Բ���ʽ�Ĵ���
//����һ��Exception,����Ҫ��ʽ�Ĵ���
public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.1);
		Circle c2 = new Circle(2.1);
		try {
			System.out.println(c1.compareTo(c2));
			System.out.println(c1.compareTo(new String("AA")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Circle{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	//�Ƚ�����Բ�İ뾶�Ĵ�С��
	public int compareTo(Object obj) throws Exception{
		if(this == obj){
			return 0;
		}
		else if(obj instanceof Circle){
			Circle c = (Circle)obj;
			if(this.radius > c.radius){
				return 1;
			}else if(this.radius == c.radius){
				return 0;
			}else{
				return -1;
			}
		}else{
			//return -2;
			//�ֶ����׳�һ���쳣
			//throw new Exception("�������������");
			//throw new String("�������������");
			throw new MyException("�������������");
		}
	}
}