package com.atguigu.day11.java;


public class TestProduct {
	public static void main(String[] args) {
		TestProduct t = new TestProduct();
		//��ʽһ������һ��ʵ��Product�ӿڵ���Ķ��󣬲����˶����뷽����
		NoteBook n = new NoteBook();
		t.show(n);
		//��ʽ��������һ��ʵ��Product�ӿڵ�������Ķ���
		Product p = new Product(){
			public void getName(){
				System.out.println("Galaxy Note3");
			}
			public void getPrice(){
				System.out.println("��5288");
			}
		};
		//��ʽ��������һ��ʵ��Product�ӿڵ����������������
		t.show(new Product(){
			public void getName(){
				System.out.println("Iphone5s");
			}
			public void getPrice(){
				System.out.println("��5288");
			}
		});
		System.out.println();
		Product p1 = t.getProduct();
		p1.getName();
		p1.getPrice();
		
	}
	
	//�ֲ��ڲ����ʹ��
	public Product getProduct(){
//		//��ʽһ��ʵ��Product�ӿڵľֲ��ڲ���
//		class Camera implements Product{
//
//			@Override
//			public void getName() {
//				System.out.println("�������");
//			}
//
//			@Override
//			public void getPrice() {
//				System.out.println("4000");
//			}
//			
//		}
//		return new Camera();
		//��ʽ����ʵ��Product�ӿڵ������ֲ��ڲ���
		return new Product(){
			public void getName() {
				System.out.println("��ֽ��");
			}

			public void getPrice() {
				System.out.println("1000");
			}
		};
		
	}
	
	public void show(Product p){
		p.getName();
		p.getPrice();
	}
}

interface Product{
	void getName();
	
	void getPrice();
}

class NoteBook implements Product{
	public void getName(){
		System.out.println("HP�ʼǱ�");
	}
	public void getPrice(){
		System.out.println("��5000");
	}
}
