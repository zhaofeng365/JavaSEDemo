package com.atguigu.day07.exer;


public class Account {
	private int id;//�˺�
	private double balance;//���
	private double annualInterestRate;//������
	
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//ȡǮ
	public void withdraw (double amount){
		if(balance >= amount){
			balance -= amount;
			System.out.println("�ɹ�ȡ����" + amount);
		}else{
			System.out.println("���㣬ȡ��ʧ�ܣ�");
		}
	}
	//��Ǯ
	public void deposit (double amount){
		balance += amount;
		System.out.println("�ɹ����룺" + amount);
	}


}
