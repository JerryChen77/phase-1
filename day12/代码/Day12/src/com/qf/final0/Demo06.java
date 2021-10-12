package com.qf.final0;

public class Demo06 {
	public static void main(String[] args) {
		Person p = new Person("zhangsi",24);
		System.out.println(p.age);	// 24
		
		changeData(p);
		System.out.println(p.age);	// 22
		
		System.out.println("=================");
		
		changeObj(p);
		System.out.println(p.age);	// 
		
	}

	public static void changeObj(Person p) {
		p = new Person("уехЩ", 33);
	}

	public static void changeData(Person p) {
		p.age = 22;
	}
}

class Person {
	String name;
	int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}