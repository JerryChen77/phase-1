package com.qf.ChenJIngLun.exam02;

public class exam01 {
	public static void main(String[] args) {
		Student s = new Student(20210001);
		Worker w = new Worker(202101);
		System.out.println(s.toString());
		s.eat();
		s.sleep();
		System.out.println(w.toString());
		w.eat();
		w.sleep();
	}
}
abstract class Person{
	private String name;
	private int age;
	
	public abstract void eat();
	public abstract void sleep();
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
class Student extends Person{
	private int StuID;
	public void study() {
		System.out.println("�Ұ�ѧϰ");
	}
	
	
	public Student(int stuID) {
		super();
		StuID = stuID;
	}


	@Override
	public void eat() {
		System.out.println("ѧ���Է�");
	}
	@Override
	public void sleep() {
		System.out.println("ѧ��˯��");
	}


	@Override
	public String toString() {
		return "Student [StuID=" + StuID + "]";
	}
	
}
class Worker extends Person{
	private int WorkID;
	public void work() {
		System.out.println("�Ұ�����");
	}
	

	public Worker(int workID) {
		super();
		WorkID = workID;
	}

	@Override
	public void eat() {
		System.out.println("���˳Է�");
	}
	@Override
	public void sleep() {
		System.out.println("����˯��");
	}


	@Override
	public String toString() {
		return "Worker [WorkID=" + WorkID + "]";
	}
	
}