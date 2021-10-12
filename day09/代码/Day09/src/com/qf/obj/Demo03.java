package com.qf.obj;

public class Demo03 {
	public static void main(String[] args) {
		Stu s1 = new Stu();
		s1.id = "199601012001";
		s1.name = "宋江";
		s1.age = 13;
		s1.gender = "男生";
		s1.show();
		
		Stu s2 = new Stu();
		s2.show();
		
		Stu s3 = s1;
		s3.show();
		
	}
}
class Stu{
	// 属性
	String id;
	String name;
	int age;
	String gender;
	// 方法
	public void study(String work) {
		System.out.println("学生的任务是:" + work);
	}
	public void eat() {}
	
	public void sleep() {}
	
	public void show() {
		System.out.println("Stu [id=" + this.id + ", name=" + 
	this.name + ", age=" + age + ", gender=" + gender + "]");
	}
	
}