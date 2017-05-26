package com.atguigu.day08.java1;

/*
 * ������������������̬��
 * 1.��̬��ָ����ʲô����̬�ԣ��������Ϊһ������Ķ��ֱ�����̬�� 
 *   1����������������д  2���������Ķ�̬��
 * 
 * 2.�������Ķ�̬��ʹ�õ�ǰ�᣺��Ҫ����ļ̳Т�Ҫ������Ը��෽������д
 * 
 * 3.�������з�Ϊ����״̬������״̬��
 *   ���ڶ�̬����˵������ʱ��"�����"���������ñ������Ϊ���������
 *   ����ʱ��"���ұ�",��ע�����������ʵ�壺����Ķ�����ôִ�еķ�������������д�ġ�
 *   
 * 4.�������Ķ�̬�ԣ�����ʹ�������ԡ�
 */
public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.walk();

		Man m = new Man();
		m.eat();
		m.walk();
		System.out.println();

		// �������Ķ�̬�ԣ����������ָ���������
		Person p1 = new Man();// ����ת��
		// ���ⷽ�����ã�ͨ�����������ָ������Ķ���ʵ�壬�����÷���ʱ��ʵ��ִ�е���������д����ķ���
		p1.eat();
		p1.walk();
		System.out.println("$" + p1.id);//1001

//		p1.smoking = null;
		// p1.entertainment();

		Person p2 = new Woman();
		p2.eat();
		p2.walk();
		// p2.shopping();
		Woman w = (Woman) p2;// ����ת��,ʹ��ǿת����()
		w.shopping();

		// java.lang.ClassCastException
		// Woman w1 = (Woman)p1;
		// w1.shopping();

		// Woman w2 = (Woman)new Man();
		// instanceof:
		// ��ʽ�� ����a instanceof ��A���ж϶���a�Ƿ�����A��һ��ʵ��.�ǵĻ�������true�����򷵻�false
		// ��a��A���ʵ������ôaҲһ����A��ĸ����ʵ����
		if (p1 instanceof Woman) {
			System.out.println("hello!");
			Woman w1 = (Woman) p1;
			w1.shopping();
		}

		if (p1 instanceof Man) {
			Man m1 = (Man) p1;
			m1.entertainment();
		}

		if (p1 instanceof Person) {
			System.out.println("��ã�");
		}

	}

	public void show(Person p) {//Person p = new Man();

	}

//	public void show(Man p) {//Man p = new Man();
//
//	}
//
//	public void show(Woman p) {
//
//	}
}
