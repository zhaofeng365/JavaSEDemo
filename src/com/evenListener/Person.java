package com.evenListener;

/**@ClassName: Person

 * @Description:�۲������ģʽ

 * @author ����

 * @date 2016-6-28 ����4:51:15


 */
/**
 * ������һ��Java�¼���������
 * 1.Java���¼����������漰������������¼�Դ���¼����������¼�����
 * 2.���¼�Դ�Ϸ�������ʱ������������¼�������һ�����������ڵ����������ʱ���ᴫ���¼��������
 * 3.�¼��������ɿ�����Ա��д��������Ա��ʱ��������У�ͨ���¼���������õ�ʱ��Դ���Ӷ���ʱ��Դ�ϵĲ������д���
 */


/*
 * 1.����һ�����࣬�˾����ܡ��Եķ���	(�¼�Դ)
 * 2.����һ���ӿ����������˵��ܡ���	(�¼�������)
 * 3.����һ���¼���������������װPerson�������	(�¼�����)
 * 4.����һ�����������Java��������
 * */

//�¼�Դ
public class Person {
	//1.1���ȶ���һ��˽�еġ��յļ����������������մ��ݽ������¼�������(�൱��һ��ȫ�ֱ���)
	private PersonListener listener;
	//1.2�����ݽ������¼�����������1.1�е�listener
	public void registerListener(PersonListener personListener){
		this.listener=personListener;
	}
	//1.3�ж�listener�Ƿ�Ϊnull�������Ϊ�գ���ִ�м������еķ���,�����ճ�����
	public void run(){
		if(listener!=null){
			Even even=new Even(this);
			this.listener.dorun(even);
		}
		System.out.println("�˾����ܵķ���");
	}
	//1.4��1.3һ������
	public void eat(){
		if(listener!=null){
			Even even=new Even(this);
			this.listener.doeat(even);
		}
		System.out.println("�˾��гԵķ���");
	}
}

//�¼�������
interface PersonListener{
	public void dorun(Even even);
	public void doeat(Even even);
	
}


//�¼�����
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
