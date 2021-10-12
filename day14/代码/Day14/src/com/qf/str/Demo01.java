package com.qf.str;

public class Demo01 {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.hashCode());

		s = "World";
		System.out.println(s.hashCode());
		
		Stu stu = new Stu("", 23);
		System.out.println(stu.hashCode());
		
		stu.name = "уехЩ";
		System.out.println(stu.hashCode());
		
	}
}

class Stu {
	String name;
	int age;

	public Stu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + "]";
	}

}
