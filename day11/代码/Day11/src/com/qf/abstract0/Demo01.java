package com.qf.abstract0;

public class Demo01 {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.eat();
//		a.sleep();
		
		Animal aa = new Dog();
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
	}
}

/**
 * 动物类
 * 	概况动物的属性和方法
 * 使用abstract修饰
 * 	变成抽象类
 * 	无法直接创建对象
 * 	可以被继承
 */
abstract class Animal{
	String type;
	String name;
	int age;
	
	public void eat() {
		System.out.println("动物需要吃饭");
	}
	
	public void sleep() {
		System.out.println("动物需要睡觉");
	}
}

class Dog extends Animal{
	
}
