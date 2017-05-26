package com.atguigu.day08.exer;


public class Account {
	protected int id;//�˺�
	protected double balance;//���
	protected double annualInterestRate;//������
	
	public Account(int id, double balance, double annualInterestRate) {
		super();
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
	//����������
	public double getMonthlyInterest(){
		return this.annualInterestRate/12;
	}
	//���
	public void deposit (double amount){
		balance += amount;
	}
	//ȡ��
	public void withdraw (double amount){
		if(this.balance >= amount)
			balance -= amount;
		else
			System.out.println("���㣡");
	}
}
