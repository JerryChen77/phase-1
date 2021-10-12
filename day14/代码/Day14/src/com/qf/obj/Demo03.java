package com.qf.obj;

public class Demo03 {
	public static void main(String[] args) {
		Student s = new Student("张三	", 23, "九堡", "中国知名度很高的一个人");
		System.out.println(s);
		System.out.println(s.getClass().getName() + "@" + Integer.toHexString(s.hashCode()));
	}
}

class Student{
	String name;
	int age;
	String address;
	String info;
	
	public Student() {
		super();
	}

	public Student(String name, int age, String address, String info) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.info = info;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", info=" + info + "]";
	}
	
	/**
	 * 	返回对象的字符串形式
	 * 		建议重写此方法
	 * 		返回对象的各种属性值
	
	@Override
	public String toString() {
		return "name=" + name + ",age=" + age + "address=" + address + ",info=" + info;
	}
	*/
	
	
}
