package com.qf.final0;

public class Demo05 {
	public static void main(String[] args) {
		final Stu s1 = new Stu("张三", 23, 173);
		System.out.println(s1);
		s1.show();
		
		// s1 = new Stu("李四", 24, 174);
		s1.height = 175;
		System.out.println(s1);
		s1.show();
	}
	
}

class Stu{
	String name;
	int age;
	double height;
	
	public Stu() {
		super();
	}

	public Stu(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void show() {
		System.out.println("Stu [name=" + name + ", age=" + age + ", height=" + height + "]");
	}
}
