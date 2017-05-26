package com.designMode.FactoryMethod;

/**
 * 什么时工厂方法模式？
 *	工厂方法模式同样属于类的创建型模式又被称 为多态工厂模式 。工厂方法模式的意义是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中。
 *	核心工厂类不再负责产品的创建，这样核心类成为一个抽象工厂角色，仅负责具体工厂子类必须实现的接口，这样进一步抽象化的好处是使得工厂方法模式可以使系
 *	统在不修改具体工厂角色的情况下引进新的产品
 *
 *	模式中包含的角色及其职责?
 *	1.抽象工厂（Creator）角色工厂方法模式的核心，任何工厂类都必须实现这个接口。
	2.具体工厂（ Concrete  Creator）角色具体工厂类是抽象工厂的一个实现，负责实例化产品对象。
	3.抽象（Product）角色工厂方法模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
	4.具体产品（Concrete Product）角色工厂方法模式所创建的具体实例对象
 */
public class MainClass {
	public static void main(String[] args) {
		//获得AppleFactory
		FruitFactory ff = new AppleFactory();
		//通过AppleFactory来获得Apple实例对象
		Fruit apple = ff.getFruit();
		apple.get();
		
		//获得BananaFactory
		FruitFactory ff2 = new BananaFactory();
		Fruit banana = ff2.getFruit();
		banana.get();
		
		//获得PearFactory
		FruitFactory ff3 = new PearFactory();
		Fruit pear = ff3.getFruit();
		pear.get();
	}
}
