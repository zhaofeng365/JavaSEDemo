package com.evenListener;

/**@ClassName: Person

 * @Description:观察者设计模式

 * @author 张清

 * @date 2016-6-28 下午4:51:15


 */
/**
 * 请描述一下Java事件监听机制
 * 1.Java的事件监听机制涉及到三个组件：事件源、事件监听器、事件对象
 * 2.当事件源上发生操作时，它将会调用事件监听的一个方法，并在调用这个方法时，会传递事件对象过来
 * 3.事件监听器由开发人员编写，开发人员再时间监听器中，通过事件对象可以拿到时间源，从而对时间源上的操作进行处理
 */


/*
 * 1.创建一个人类，人具有跑、吃的方法	(事件源)
 * 2.创建一个接口用来监视人的跑、吃	(事件监听器)
 * 3.创建一个事件对象。里面用来封装Person这个对象	(事件对象)
 * 4.创建一个测试类测试Java监听机制
 * */

//事件源
public class Person {
	//1.1首先定义一个私有的、空的监听器对象，用来接收传递进来的事件监听器(相当于一个全局变量)
	private PersonListener listener;
	//1.2将传递进来的事件监听器付给1.1中的listener
	public void registerListener(PersonListener personListener){
		this.listener=personListener;
	}
	//1.3判断listener是否为null，如果不为空，则执行监听器中的方法,否则照常调用
	public void run(){
		if(listener!=null){
			Even even=new Even(this);
			this.listener.dorun(even);
		}
		System.out.println("人具有跑的方法");
	}
	//1.4和1.3一个道理
	public void eat(){
		if(listener!=null){
			Even even=new Even(this);
			this.listener.doeat(even);
		}
		System.out.println("人具有吃的方法");
	}
}

//事件监听器
interface PersonListener{
	public void dorun(Even even);
	public void doeat(Even even);
	
}


//事件对象
class Even{
	private Person person;
	
	public Even(Person person) {
		super();
		this.person = person;
	}

	public Even() {
		super();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
