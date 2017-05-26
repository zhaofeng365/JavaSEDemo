package com.atguigu.day11.exer;


/*
 * ����SalariedEmployee�ඨ��HourlyEmployee�࣬ʵ�ְ�Сʱ���㹤�ʵ�Ա���������������
 private��Ա����wage��hour��
 ʵ�ָ���ĳ��󷽷�earnings(),�÷�������wage*hourֵ��toString()�������Ա��������Ϣ
 ��Ա����name��number,birthday��

 */
public class HourlyEmployee extends Employee {
	private double wage;
	private double hour;

	public double earnings() {
		return wage * hour;
	}

	public HourlyEmployee(String name, int number, MyDate birthday,
			double wage, double hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [" + super.toString() + "wage=" + wage
				+ ", hour=" + hour + "]";
	}

}
