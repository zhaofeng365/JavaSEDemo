package com.interview;

public class Bank {

	private int count = 0;// 账户余额

	// 存钱
	public    void addMoney(int money) {
		count += money;
		System.out.println(System.currentTimeMillis() + "存进：" + money);
	}

	// 取钱
	public   void subMoney(int money) {
		if (count - money < 0) {
			System.out.println("取钱余额不足");
			return;
		}
		count -= money;
		System.out.println(System.currentTimeMillis() + "取出：" + money);
	}

	// 查询
	public void lookMoney() {
		System.out.println(System.currentTimeMillis() + "查询账户余额：" + count);
	}
	public static void main(String[] args) {
		System.out.println("CDKJ123434".indexOf("CDKJ1"));
	}
}