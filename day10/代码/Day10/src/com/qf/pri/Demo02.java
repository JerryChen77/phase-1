package com.qf.pri;

public class Demo02 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "王五";
		s1.setAge(255);
		// s1.age = 2555;
		s1.show();
	}
	
}

/**
 * 	私有化成员变量
 * 	提供公开的方法
 * 	在方法中设置规则
 * 		get
 * 			读取	
 * 		set
 * 			设置
 */
class Student{
	String name;
	// 私有化属性,只能在本类中使用
	private int age;
	
	public void show() {
		System.out.println("我是" + name + ",今年" + getAge());
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// 判断age是否合法
		if (age > 0 && age < 135) {
			this.age = age;
		} else {
			this.age = -1;
			System.err.println("年龄不合法");
		}
	}
}
