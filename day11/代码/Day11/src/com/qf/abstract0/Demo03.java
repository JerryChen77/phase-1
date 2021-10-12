package com.qf.abstract0;

public class Demo03 {
	public static void main(String[] args) {
		
	}
}

class People{
	String name;
	int age;
	
	public People() {
		super();
	}

	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		
	}
	
	private void showS() {
		
	}
}

abstract class Person{
	String name;
	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		
	}
	
	// 抽象类中的抽象方法不能私有
	// private abstract void showS();
	
	public abstract void eat();
}
