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
	
	// �������еĳ��󷽷�����˽��
	// private abstract void showS();
	
	public abstract void eat();
}
