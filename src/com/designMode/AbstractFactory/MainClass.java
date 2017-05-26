package com.designMode.AbstractFactory;
/**
 * 什么是抽象工厂模式?
 * 抽象工厂模式是所有形态的工厂模式中最为抽象和最具一般性的。抽象工厂模式可以向客户端提供一个接口，
 * 使得客户端在不必指定产品的具体类型的情况下，能够创建多个产品族的产品对象。
 * 
 * 模式中包含的角色及其职责？
 *  1.抽象工厂（Creator）角色抽象工厂模式的核心，包含对多个产品结构的声明，任何工厂类都必须实现这个接口。
	2.具体工厂（ Concrete  Creator）角色具体工厂类是抽象工厂的一个实现，负责实例化某个产品族中的产品对象。
	3.抽象（Product）角色抽象模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
	4.具体产品（Concrete Product）角色抽象模式所创建的具体实例对象
	总结：抽象工厂中方法对应产品结构，具体工厂对应产品族
 */
public class MainClass {
	public static void main(String[] args) {
		FruitFactory ff = new NorthFruitFactory();
		Fruit apple = ff.getApple();
		apple.get();
		
		Fruit banana = ff.getBanana();
		banana.get();
		
		FruitFactory ff2= new SouthFruitFactory();
		Fruit apple2 = ff2.getApple();
		apple2.get();
		
		Fruit banana2 = ff2.getBanana();
		banana2.get();
		
		FruitFactory ff3 = new WenshiFruitFactory();
		Fruit apple3 = ff3.getApple();
		apple3.get();
		
		Fruit banana3 = ff3.getBanana();
		banana3.get();
	}
}
