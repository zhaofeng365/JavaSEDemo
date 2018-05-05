package com.hotSpot;

import java.util.Hashtable;

public class InsertData {

	private Object object = new Object();

	public void insert(Thread thread) {
		synchronized (object) {
			System.out.println("  insert  ");
		}

	}

	public synchronized void insert1(Thread thread) {
		System.out.println("  insert1  ");
	}

	public void insert2(Thread thread) {
		System.out.println("  insert2  ");
	}

	public static void main(String[] args) {
		//ConcurrentHashMap
		Hashtable<String, String> table = new Hashtable<String, String>();
		InsertData data = new InsertData();
		data.insert(new Thread());
		data.insert1(new Thread());
		data.insert2(new Thread());
	}
}