package com.proxy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable {

	private static final long serialVersionUID = 1L;

	public static int staticVar = 5;
	public int var = 6;
	
	
	public static void main(String[] args) {
		try {
			Test test = new Test();
			//初始时staticVar为5
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("result.obj"));
			out.writeObject(new Test());
			out.close();

			//序列化后修改为10
			Test.staticVar = 10;
			test.var = 11;

			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("result.obj"));
			Test t = (Test) oin.readObject();
			oin.close();
			
			//再读取，通过t.staticVar打印新的值
			System.out.println(t.staticVar);
			System.out.println(t.var);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}