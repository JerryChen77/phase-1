package com.qf.this0;

public class Demo01 {
	public static void main(String[] args) {
		Human h1 = new Human("���", 33, "����");
		h1.show();
		System.out.println("h1=====" + h1);
		
		Human h2 = new Human("������", 22, "���");
		h2.show();
		System.out.println("h2=====" + h2);
	}
}

class Human{
	String name;
	int age;
	String add;
	
	public Human() {}
	
	public Human(String n,int a,String add) {
		name = n;
		age = a;
		this.add = add;
	}
	
	public void show() {
		System.out.println("����" + name + "����" + age + "����" + add);
		System.out.println(this);
	}
}
