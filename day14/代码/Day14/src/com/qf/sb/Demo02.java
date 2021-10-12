package com.qf.sb;

public class Demo02 {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.hashCode());

		s = "World";
		System.out.println(s.hashCode());
		
		System.out.println("=============");
		
		Stu stu = new Stu("", 23);
		System.out.println(stu.hashCode());
		
		stu.name = "ÕÅÈý";
		System.out.println(stu.hashCode());
		
		System.out.println("=============");
		
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.hashCode());
		
		buffer.append(true);
		System.out.println(buffer.hashCode());
		

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
