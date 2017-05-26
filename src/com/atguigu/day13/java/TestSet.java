package com.atguigu.day13.java;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//import org.junit.Test;

/*
 * Collection�ӿ� ��
 * 		|------List�ӿڣ�
 * 			|------ArrayList����Ҫ��ʵ���ࣩ��
 * 			|------LinkedList������Ƶ���Ĳ��롢ɾ����������
 * 			|------Vector�����ϵ�ʵ���ࡢ�̰߳�ȫ�ģ���Ч��Ҫ����ArrayList��
 * 		|------Set�ӿڣ��洢����ģ������ظ���Ԫ��.Set�г��õķ�������Collection�¶���ġ�
 *     				|------HashSet(��Ҫʵ����)
 |------LinkedHashSet
 |------TreeSet
 */
public class TestSet {
	//@Test
	public void testTreeSet3() {

		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Customer && o2 instanceof Customer) {
					Customer c1 = (Customer) o1;
					Customer c2 = (Customer) o2;
					int i = c1.getId().compareTo(c2.getId());
					if (i == 0) {
						return c1.getName().compareTo(c2.getName());
					}
					return i;
				}
				return 0;
			}
		});
		set.add(new Customer("AA", 1003));
		set.add(new Customer("BB", 1002));
		set.add(new Customer("GG", 1004));
		set.add(new Customer("CC", 1001));
		set.add(new Customer("DD", 1001));

		for (Object str : set) {
			System.out.println(str);
		}
	}

	/*
	 * TreeSet�Ķ������� ������Ĳ��� compare()��hashCode()�Լ�equals()���߱���һ�£�
	 */
	//@Test
	public void testTreeSet2() {
		// 1.����һ��ʵ����Comparator�ӿڵ������
		Comparator com = new Comparator() {
			// ��TreeSet�����Customer��Ķ����ڴ�compare()�����У�ָ���ǰ���Customer
			// ���ĸ���������ġ�
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Customer && o2 instanceof Customer) {
					Customer c1 = (Customer) o1;
					Customer c2 = (Customer) o2;
					int i = c1.getId().compareTo(c2.getId());
					if (i == 0) {
						return c1.getName().compareTo(c2.getName());
					}
					return i;
				}
				return 0;
			}
		};
		// 2.���˶�����Ϊ�βδ��ݸ�TreeSet�Ĺ�������
		TreeSet set = new TreeSet(com);
		// 3.��TreeSet�����Comparator�ӿ��е�compare�������漰����Ķ���
		set.add(new Customer("AA", 1003));
		set.add(new Customer("BB", 1002));
		set.add(new Customer("GG", 1004));
		set.add(new Customer("CC", 1001));
		set.add(new Customer("DD", 1001));

		for (Object str : set) {
			System.out.println(str);
		}
	}

	/*
	 * TreeSet: 1.��TreeSet����ӵ�Ԫ�ر�����ͬһ����ġ�
	 * 2.���԰�����ӽ������е�Ԫ�ص�ָ����˳���������String����װ���Ĭ�ϰ��մ�С�����˳�������
	 * 3.����TreeSet������Զ�����Ķ���ʱ�����������򷽷�������Ȼ����ڶ�������
	 * 4.��Ȼ����Ҫ���Զ�����ʵ��java.lang.Comparable�ӿڲ���д��compareTo(Object obj)�ĳ��󷽷�
	 * �ڴ˷����У�ָ�������Զ�������ĸ����Խ�������
	 * 
	 * 5.��TreeSet�����Ԫ��ʱ�����Ȱ���compareTo()���бȽϣ�һ������0����Ȼ������������Ĵ�
	 * ����ֵ��ͬ�����ǳ������Ϊ��������������ͬ�ģ�������һ������Ͳ�����ӽ�����
	 * 
	 * >compareTo()��hashCode()�Լ�equals()���߱���һ�£�
	 */
	//@Test
	public void testTreeSet1() {
		Set set = new TreeSet();
		// set.add(new String("AA"));
		// set.add(new String("AA"));
		// set.add("JJ");
		// set.add("GG");
		// set.add("MM");
		// ��Person��û��ʵ��Comparable�ӿ�ʱ������TreeSet�����Person����ʱ����ClassCastException
		set.add(new Person("CC", 23));
		set.add(new Person("MM", 21));
		set.add(new Person("GG", 25));
		set.add(new Person("JJ", 24));
		set.add(new Person("KK", 20));
		set.add(new Person("DD", 20));
		// set.add("AA");

		for (Object str : set) {
			System.out.println(str);
		}

	}

	/*
	 * LinkedHashSet:ʹ������ά����һ����ӽ������е�˳�򡣵��µ����Ǳ���LinkedHashSet����
	 * Ԫ��ʱ���ǰ�����ӽ�ȥ��˳������ģ�
	 * 
	 * LinkedHashSet���������Ե��� HashSet�����ڵ������� Set ���ȫ��Ԫ��ʱ�кܺõ����ܡ�
	 */
	//@Test
	public void testLinkedHashSet() {
		Set set = new LinkedHashSet();
		set.add(123);
		set.add(456);
		set.add(new String("AA"));
		set.add(new String("AA"));
		set.add("BB");
		set.add(null);

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	/*
	 * Set:�洢��Ԫ��������ģ������ظ��ģ�
	 *  1.�����ԣ������ԣ�= ����ԡ������������ԣ�ָ����Ԫ���ڵײ�洢��λ��������ġ�
	 * 2.�����ظ��ԣ�����Set����ӽ���ͬ��Ԫ�ص�ʱ�򣬺�������������ӽ�ȥ��
	 * 
	 * ˵����Ҫ����ӽ�Set�е�Ԫ�����ڵ��࣬һ��Ҫ��дequals()��hashCode()������ ������֤Set��Ԫ�صĲ����ظ��ԣ�
	 * 
	 * Set�е�Ԫ��ʱ��δ洢���أ�ʹ���˹�ϣ�㷨��
	 * ����Set����Ӷ���ʱ�����ȵ��ô˶����������hashCode()����������˶���Ĺ�ϣֵ���˹�ϣֵ
	 * �����˴˶�����Set�еĴ洢λ�á�����λ��֮ǰû�ж���洢�����������ֱ�Ӵ洢����λ�á�����λ��
	 * ���ж���洢����ͨ��equals()�Ƚ������������Ƿ���ͬ�������ͬ����һ������Ͳ�������ӽ����� ��һ����false�أ����洢������������ˣ�
	 * >Ҫ��hashCode()����Ҫ��equals()����һ�¡�
	 */
	//@Test
	public void testHashSet() {
		Set set = new HashSet();
		set.add(123);
		set.add(456);
		set.add(new String("AA"));
		set.add(new String("AA"));
		set.add("BB");
		set.add(null);
		Person p1 = new Person("GG", 23);
		Person p2 = new Person("GG", 23);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		set.add(p1);
		set.add(p2);
		System.out.println(set.size());
		System.out.println(set);
	}
}
