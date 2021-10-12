package com.qf.super0;

public class Demo01 {
	public static void main(String[] args) {
		Human h1 = new Human();
		System.out.println(h1.type);
		System.out.println(h1.age);
		
		h1.eat();
		h1.show();
		h1.eat();
		
		System.out.println("================");
		
		Human h2 = new Human("动物类", 22,"张三");
		
	}
}

class Animal{
	String type = "动物";
	int age;
	
	public Animal() {
		super();
	}

	public Animal(String type, int age) {
		super();
		this.type = type;
		this.age = age;
		System.out.println("父类的构造器");
	}
	
	public void eat() {
		System.out.println("动物需要进食");
	}
	
	public void sleep() {
		
	}
}

class Human extends Animal{
	String name;
	// 子类的属性屏蔽了继承的父类属性
	String type = "人类";
	
	public Human() {
		
	}
	
	public Human(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Human(String type, int age,String name) {
		super(type, age);
		System.out.println("子类的构造器");
		this.name = name;
	}

	public void show() {
		// 这个type需要使用Animal中的type
		System.out.println("人在自然界中是" + super.type);
	}
	
	@Override
	public void eat() {
		// 调用父类中的方法
		super.eat();
		System.out.println("子类重写eat方法");
	}
}