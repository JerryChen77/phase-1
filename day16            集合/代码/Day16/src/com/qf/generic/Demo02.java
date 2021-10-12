package com.qf.generic;

public class Demo02 {
	public static void main(String[] args) {
		Student s01 = new Student();
		s01.setId("20170110");
		
		Student<Integer,Long> s02 = new Student<Integer,Long>();
		s02.setId(20170110);
		
		// Student<String> s03 = new Student();
		
	}
}

class Student<T, E extends Number> {
	T id;
	String name;
	int age;
	String gender;
	E phonenum;

	public Student() {
		super();
	}

	public Student(T id, String name, int age, String gender, E phonenum) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phonenum = phonenum;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public E getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(E phonenum) {
		this.phonenum = phonenum;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phonenum=" + phonenum
				+ "]";
	}

}
