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
		
		Human h2 = new Human("������", 22,"����");
		
	}
}

class Animal{
	String type = "����";
	int age;
	
	public Animal() {
		super();
	}

	public Animal(String type, int age) {
		super();
		this.type = type;
		this.age = age;
		System.out.println("����Ĺ�����");
	}
	
	public void eat() {
		System.out.println("������Ҫ��ʳ");
	}
	
	public void sleep() {
		
	}
}

class Human extends Animal{
	String name;
	// ��������������˼̳еĸ�������
	String type = "����";
	
	public Human() {
		
	}
	
	public Human(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Human(String type, int age,String name) {
		super(type, age);
		System.out.println("����Ĺ�����");
		this.name = name;
	}

	public void show() {
		// ���type��Ҫʹ��Animal�е�type
		System.out.println("������Ȼ������" + super.type);
	}
	
	@Override
	public void eat() {
		// ���ø����еķ���
		super.eat();
		System.out.println("������дeat����");
	}
}