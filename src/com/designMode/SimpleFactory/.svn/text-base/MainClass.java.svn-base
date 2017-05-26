package com.designMode.SimpleFactory;

/**
 * 什么时工厂模式？
 * 简单工厂模式属于类的创建型模式,又叫做静态工厂方法模式。通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
 *模式中包含的角色及其职责？
 *1.工厂（Creator）角色简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类可以被外界直接调用，创建所需的产品对象。
  2.抽象（Product）角色简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
  3.具体产品（Concrete Product）角色简单工厂模式所创建的具体实例对象
 */
public class MainClass {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		//实例化一个Apple
//		Apple apple = new Apple();
//		//实例化一个Banana
//		Banana banana = new Banana();
//		
//		apple.get();
//		banana.get();
		
//		//实例化一个Apple,用到了多态
//		Fruit apple = new Apple();
//		Fruit banana = new Banana();
//		apple.get();
//		banana.get();
		
//		//实例化一个Apple
//		Fruit apple = FruitFactory.getApple();
//		Fruit banana = FruitFactory.getBanana();
//		apple.get();
//		banana.get();
		
		Fruit apple = FruitFactory.getFruit("com.designMode.SimpleFactory.Apple");
		Fruit banana = FruitFactory.getFruit("com.designMode.SimpleFactory.Banana");
		apple.get();
		banana.get();
		
	}
}
