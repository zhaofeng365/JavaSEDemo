package com.atguigu.day08.java1;
//��̬ʹ�õ�һ������
public class TestAnimal {
	public static void main(String[] args) {
		TestAnimal t = new TestAnimal();
		t.func(new Animal());
		t.func(new Dog());
		
		t.func(new Cat());
		
	}
	public void func(Animal a){//Animal a = new Dog();
		a.eat();
		a.jump();
		
		if(a instanceof Dog){
			Dog d = (Dog)a;
			d.Wang();
		}
		if(a instanceof Cat){
			Cat c = (Cat)a;
			c.catchMouse();
		}
	}
//	public void func(Dog a){
//		a.eat();
//		a.jump();
//	}
}
class Animal{
	String name;
	int age;
	
	public void eat(){
		System.out.println("��ʳ");
	}
	public void jump(){
		System.out.println("��");
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("����ʳ");
	}
	public void jump(){
		System.out.println("������ǽ");
	}
	
	public void Wang(){
		System.out.println("������");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
	public void jump(){
		System.out.println("è��");
	}
	public void catchMouse(){
		System.out.println("èץ����");
	}
}