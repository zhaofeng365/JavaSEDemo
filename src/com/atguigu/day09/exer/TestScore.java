package com.atguigu.day09.exer;

import java.util.Scanner;
import java.util.Vector;

/*
 * ����Vector�������鴦���Ӽ��̶���ѧ���ɼ����Ը�������������������ҳ���߷֣������ѧ���ɼ��ȼ���
	��ʾ������һ�����������Ⱦ͹̶����䣬�����ڴ�������ǰ����Ҫ֪�����ĳ��ȡ�
	��������java.util.Vector���Ը�����Ҫ��̬������
	����Vector����Vector v=new Vector();
	���������Ԫ�أ�v.addElement(obj);   //obj�����Ƕ���
	ȡ�������е�Ԫ�أ�Object  obj=v.elementAt(0);
	ע���һ��Ԫ�ص��±���0������ֵ��Object���͵ġ�
	���������ĳ��ȣ�v.size();
	������߷����10���ڣ�A�ȣ�20���ڣ�B�ȣ�
	      30���ڣ�C�ȣ�������D��
 */
public class TestScore {
	public static void main(String[] args) {
		//1.����Scanner�Ķ�����ʾ�Ӽ�������ѧ���ĳɼ����Ը����������������
		Scanner s = new Scanner(System.in);
		System.out.println("������ѧ���ĳɼ������Ը����������������");
		//2.for(;;),�Ӽ������λ�ȡѧ���ĳɼ�����������Vector v=new Vector()�����Ķ���v�С�
		Vector v=new Vector();
		int maxScore = 0;//��¼��߷�
		for(;;){
			int score = s.nextInt();
			if(score < 0){
				break;
			}
			//3.���������������ĳɼ��е���߷�
			//��ȡѧ���ɼ��е���߷�
			if(maxScore < score){
				maxScore = score;
			}
			//���ν�ѧ���ɼ������v��
			Integer score1 = new Integer(score);
			v.addElement(score1);
		}
		
		//4.ͨ��v.elementAt(i)���λ�ȡ����v�е�Ԫ�أ�ͬʱ�ж�һ�¸��������ĵȼ��������
		for(int i = 0;i < v.size();i++){
			Integer score = (Integer)v.elementAt(i);
			char level;
			if(maxScore - score <= 10){
				level = 'A';
			}else if(maxScore - score <= 20){
				level = 'B';
			}else if(maxScore - score <= 30){
				level = 'C';
			}else{
				level = 'D';
			}
			System.out.println("ѧ���ɼ�Ϊ��" + score + ",�ȼ�Ϊ��" + level);
		}
	}
}
