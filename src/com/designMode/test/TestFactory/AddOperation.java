package com.designMode.test.TestFactory;


public class AddOperation extends Operation {

	public double getResult() {
		double result = this.getNum1() + this.getNum2();
		return result;
	}
}
