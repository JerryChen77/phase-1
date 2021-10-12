package com.qf.obj;

public class Demo04 {
	public static void main(String[] args) {
		// 创建对象s1
		Student s1 = new Student();
		s1.name = "李逵";
		s1.gender = "男";
		s1.age = 15;
		s1.score = 88;
		s1.sayHi();
		
		// 创建对象s2
		Student s2 = new Student();
		s2.name = "李鬼";
		s2.gender = "男";
		s2.age = 14;
		s2.score = 87;
		s2.sayHi();
		
	}
}
