package com.designMode.FactoryMethod;


public class AppleFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Apple();
	}

}
