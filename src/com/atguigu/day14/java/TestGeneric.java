package com.atguigu.day14.java;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import org.junit.Test;

/*
 * ���͵�ʹ��
 * 1.�ڼ�����ʹ�÷���(����)
 * 2.�Զ��巺���ࡢ���ͽӿڡ����ͷ�������� --->ʹ�ã�
 * 3.������̳еĹ�ϵ
 * 4.ͨ���
 * 
 */
public class TestGeneric {
	/*
	 * ͨ�����ʹ��
	 */
//	@Test
	public void test7(){
		List<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		List<?> list1 = list;
		//���Զ�ȡ����Ϊͨ����ļ�����Ķ���
		Iterator<?> iterator = list1.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//������������Ϊͨ����ļ�������д�����Ψһ�������null
//		list1.add("CC");
//		list1.add(123);
		list1.add(null);
	}
	/*
	 * ͨ��� ?
	 * List<A>��List<B>��������������List<?>������
	 * 
	 * ? extends A :���Դ��A��������
	 * ? super A:���Դ��A���丸��
	 */
	//@Test
	public void test6(){
		List<?> list = null;
		List<Object> list1 = new ArrayList<Object>();
		List<String> list2 = new ArrayList<String>();
		list = list1;
		list = list2;
		
		show(list1);
//		show(list2);
		show1(list1);
		show1(list2);
		
		List<? extends Number> list3 = null;
		List<Integer> list4 = null;
		list3 = list4;
//		list3 = list1;
		List<? super Number> list5 = null;
		list5 = list1;
	}
	
	public void show(List<Object> list){
		
	}
	public void show1(List<?> list){
		
	}
	/*
	 * ������̳еĹ�ϵ:
	 * ����A����B�����࣬��ôList<A>�Ͳ���List<B>���ӽӿ�
	 */
	//@Test
	public void test5(){
		Object obj = null;
		String str = "AA";
		obj = str;
		
		Object[] obj1 = null;
		String[] str1 = new String[]{"AA","BB","CC"};
		obj1 = str1;
		
		List<Object> list = null;
		List<String> list1 = new ArrayList<String>();
//		list = list1;
		//����list = list1����
		//list.add(123);
		//String str = list1.get(0);//�������⣬���Լ��費����
	}
	
	//�Զ��巺�����ʹ��
	//@Test
	public void test4(){
		//1.��ʵ����������Ķ���ʱ��ָ�����͵����͡�
		//ָ���Ժ󣬶�Ӧ����������ʹ�÷��͵�λ�ã�����Ϊʵ������ָ���ķ��͵�����
		//2.��������Զ����˷����࣬������ʵ����ʱû��ʹ�ã���ôĬ��������Object���
		Order<Boolean> order = new Order<Boolean>();
//		order.getT();
		order.setT(true);
		System.out.println(order.getT());
		order.add();
		List<Boolean> list = order.list;
		System.out.println(list);
		
		SubOrder o = new SubOrder();
		List<Integer> list1 = o.list;
		System.out.println(list1);
		//��ͨ����������ͷ���ʱ��ָ�����ͷ��������͡�
		Integer i = order.getE(34);
		Double d = order.getE(2.3);
		
		Integer[] in = new Integer[]{1,2,3};
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = order.fromArrayToList(in, list2);
		System.out.println(list3);
	}
	//@Test
	public void test3(){
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("AA", 78);
		map.put("BB", 87);
		map.put("DD", 98);
		
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		for(Map.Entry<String,Integer> o : set){
			System.out.println(o.getKey() + "--->" + o.getValue());
		}
	}
	
	//2.�ڼ�����ʹ�÷���
	//@Test
	public void test2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(78);
		list.add(87);
//		list.add("AA");
		
//		for(int i = 0;i < list.size();i++){
//			int score = list.get(i);
//			System.out.println(score);
//		}
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	//1.�ڼ�����û��ʹ�÷��͵������
	//@Test
	public void test1(){
		List list = new ArrayList();
		list.add(89);
		list.add(87);
		list.add(67);
		//1.û��ʹ�÷��ͣ��κ�Object��������Ķ��󶼿�����ӽ���
		list.add(new String("AA"));
		
		for(int i = 0;i < list.size();i++){
			//2.ǿתΪint��ʱ�����ܱ�ClassCastException���쳣
			int score = (Integer)list.get(i);
			System.out.println(score);
		}
	}
}
