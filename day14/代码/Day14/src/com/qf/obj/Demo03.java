package com.qf.obj;

public class Demo03 {
	public static void main(String[] args) {
		Student s = new Student("����	", 23, "�ű�", "�й�֪���Ⱥܸߵ�һ����");
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
	 * 	���ض�����ַ�����ʽ
	 * 		������д�˷���
	 * 		���ض���ĸ�������ֵ
	
	@Override
	public String toString() {
		return "name=" + name + ",age=" + age + "address=" + address + ",info=" + info;
	}
	*/
	
	
}
