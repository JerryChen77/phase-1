package com.qf.ChenJIngLun.exam03;

import java.util.ArrayList;

public class exam02 {
public static void main(String[] args) {
	ArrayList<Stu> a = new ArrayList<Stu>();
	a.add(new Stu("����", 20, "����"));
	a.add(new Stu("����", 20, "�Ϻ�"));
	a.add(new Stu("����", 20, "�㶫"));
	a.add(new Stu("����", 20, "���"));
	a.add(new Stu("����", 20, "����"));
	a.add(new Stu("����", 20, "����"));
	a.trimToSize();
	ArrayList<Stu> b = new ArrayList<Stu>();
	for (int i = 0; i < a.size(); i++) {
		if(a.get(i).getName().startsWith("��")) {
			b.add(a.get(i));
		}
	}
	for (Stu stu : b) {
		System.out.println(stu);
	}
}
}
class Stu{
	String name;
	int age;
	String address;
	public Stu(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}