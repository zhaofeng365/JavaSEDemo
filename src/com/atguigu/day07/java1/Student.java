package com.atguigu.day07.java1;
class A{
	
}

public class Student extends Person{
//public class Student extends Person,A{
//	private String name;
//	private int age;
	private String schoolName;
	
	public Student(){
		
	}
	public Student(String name,int age){
//		this.name = name;
//		this.age = age;
		this.setName(name);
		this.setAge(age);
	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	�Ը���ͬ���ķ�������д������
	public void eat(){
		System.out.println("Ӧ�ö����Ӫ����");
	}
	public void walk(){
		System.out.println("��������ı���������·");
	}
	public void info(){
		eat();
		//System.out.println("name:" + name);
		System.out.println("����һ��ѧ��");
	}
	//���ǶԸ���˽�е�sleep()��������д��
	private int sleep(){
		return 0;
	}
	
}
