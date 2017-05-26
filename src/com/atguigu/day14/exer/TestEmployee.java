package com.atguigu.day14.exer;

 

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//import org.junit.Test;

/*
 * ��������� 5 �����󣬲�����Щ������� TreeSet �����У���һ�£�TreeSet ��ʹ�÷��������壩
�ֱ��������ַ�ʽ�Լ����е�Ԫ�ؽ������򣬲����������

1). ʹEmployee ʵ�� Comparable �ӿڣ����� name ����
2). ���� TreeSet ʱ���� Comparator���󣬰��������ڵ��Ⱥ�����

��ʾ��Employee���Ƿ���Ҫ��дequals()������MyDate���أ�

 */
public class TestEmployee {
	//�������򣺴��� TreeSet ʱ���� Comparator���󣬰��������ڵ��Ⱥ�����
	//@Test
	public void test2(){
		Comparator com = new Comparator(){

			
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Employee1 && o2 instanceof Employee1){
					Employee1 e1 = (Employee1)o1;
					Employee1 e2 = (Employee1)o2;
					MyDate birth1 = e1.getBirthday();
					MyDate birth2 = e2.getBirthday();
					if(birth1.getYear() != birth2.getYear()){
						return birth1.getYear() - birth2.getYear();
					}else{
						if(birth1.getMonth() != birth2.getMonth()){
							return birth1.getMonth() - birth2.getMonth();
						}else{
							return birth1.getDay() - birth2.getDay();
						}
					}
				}
				return 0;
			}
			
		};
		TreeSet<Employee1> set = new TreeSet<Employee1>(com);
		Employee1 e1 = new Employee1("���»�", 55, new MyDate(4, 12, 1976));
		Employee1 e2 = new Employee1("������", 43, new MyDate(7, 3, 1954));
		Employee1 e3 = new Employee1("��ѧ��", 33, new MyDate(9, 12, 1954));
		Employee1 e4 = new Employee1("����", 54, new MyDate(12, 3, 1954));
		Employee1 e5 = new Employee1("������", 65, new MyDate(4, 21, 1945));
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		Iterator<Employee1> i = set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
	
	//��Ȼ���� ʹEmployee ʵ�� Comparable �ӿڣ����� name ����
	//@Test
	public void test1(){
		Employee e1 = new Employee("���»�", 55, new MyDate(4, 12, 1976));
		Employee e2 = new Employee("������", 43, new MyDate(7, 3, 1965));
		Employee e3 = new Employee("��ѧ��", 33, new MyDate(9, 12, 1954));
		Employee e4 = new Employee("����", 54, new MyDate(12, 2, 1967));
		Employee e5 = new Employee("������", 65, new MyDate(4, 21, 1945));
//		Employee e6 = new Employee("������", 63, new MyDate(4, 21, 1945));
		TreeSet<Employee> set = new TreeSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
//		set.add(e6);
		
		Iterator<Employee> i = set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
