package com.qf.obj;

public class Demo03 {
	public static void main(String[] args) {
		Stu s1 = new Stu();
		s1.id = "199601012001";
		s1.name = "�ν�";
		s1.age = 13;
		s1.gender = "����";
		s1.show();
		
		Stu s2 = new Stu();
		s2.show();
		
		Stu s3 = s1;
		s3.show();
		
	}
}
class Stu{
	// ����
	String id;
	String name;
	int age;
	String gender;
	// ����
	public void study(String work) {
		System.out.println("ѧ����������:" + work);
	}
	public void eat() {}
	
	public void sleep() {}
	
	public void show() {
		System.out.println("Stu [id=" + this.id + ", name=" + 
	this.name + ", age=" + age + ", gender=" + gender + "]");
	}
	
}