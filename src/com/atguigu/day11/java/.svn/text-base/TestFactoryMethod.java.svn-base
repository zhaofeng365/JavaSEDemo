package com.atguigu.day11.java;

//接口的应用：工厂方法的设计模式
public class TestFactoryMethod {
	public static void main(String[] args) {
		IWorkFactory i = new StudentWorkFactory();
		i.getWork().doWork();
		
		IWorkFactory i1 = new TeacherWorkFactory();
		i1.getWork().doWork();
	}
}

interface IWorkFactory{
	Work getWork();
}
class StudentWorkFactory implements IWorkFactory{

	public Work getWork() {
		return new StudentWork();
	}
	
}
class TeacherWorkFactory implements IWorkFactory{

	public Work getWork() {
		return new TeacherWork();
	}
	
}

interface Work{
	void doWork();
}

class StudentWork implements Work{

	public void doWork() {
		System.out.println("学生写作业");
	}
	
}
class TeacherWork implements Work{

	public void doWork() {
		System.out.println("老师批改作业");
	}
	
}
