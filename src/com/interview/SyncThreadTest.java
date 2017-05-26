package com.interview;

public class SyncThreadTest {
	public static void main(String args[]) {
		final Bank bank = new Bank();

		Thread tadd = new Thread(new Runnable() {

			public void run() {
				while (true) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					bank.addMoney(100);
				}
			}
		});

		Thread tsub = new Thread(new Runnable() {

			public void run() {
				while (true) {
					bank.subMoney(100);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread tlook = new Thread(new Runnable() {
			public void run() {
				while (true) {
					bank.lookMoney();
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		tsub.start();

		tadd.start();
		
		tlook.start();
	}

}
