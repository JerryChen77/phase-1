package com.qf.obj;

public class Demo08 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.show();
	}
}

class Cat{
	String type;
	String name;
	int age;
	
	public Cat() {}
	
	public Cat(String type, int age) {
		super();
		this.type = type;
		this.age = age;
	}

	// alt + shift + s
	
	public Cat(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	
	public Cat(String t,String n,int a) {
		type = t;
		name = n;
		age = a;
	}

	public void show() {
		System.out.println("Cat [type=" + type + ", name=" + name + ", age=" + age + "]");
	}
	
}
