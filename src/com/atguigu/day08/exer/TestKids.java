package com.atguigu.day08.exer;
/*
 * ��Kids���main������ʵ����Kids�Ķ���someKid���øö�������丸��ĳ�Ա������������

 */
public class TestKids {
	public static void main(String[] args) {
		Kids someKid = new Kids();
		
		someKid.setSalary(0);
		someKid.setSex(1);
		someKid.setYearsOld(13);
		
		someKid.employees();
		someKid.manOrWoman();
		someKid.printAge();
	}
}
