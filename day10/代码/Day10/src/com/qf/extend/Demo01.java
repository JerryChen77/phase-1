package com.qf.extend;

public class Demo01 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		
		Hippo hippo = new Hippo();
	}
}

/**
 * 	������
 */
class Animal{
	String type;
	String name;
	String age;
	double height;
	double length;
	double weight;
	String color;
	String gender;
	String address;
	String info;
	
	public void eat() {}
	
	public void sleep() {}
	
}

/**
 * 	ʨ����
 */
class Lion{
	String type;
	String name;
	String age;
	double height;
	double length;
	double weight;
	String color;
	String gender;
	String address;
	String info;
	
	public void eat() {}
	
	public void hunt() {}
	
	public void sleep() {}
	
}

/**
 * 	�����
 */
class HoneyBadger{
	String type;
	String color;
	String name;
	String age;
	double height;
	double weight;
	double length;
	String info;
	
	public void eat() {}
	
	public void hunt() {}
	
	public void sleep() {}
	
}

/**
 * 	������
 */
class Zebra{
	String type;
	String color;
	String name;
	String age;
	double height;
	double weight;
	double length;
	String info;
	
	public void eat() {}
	
	public void hunt() {}
	
	public void sleep() {}
}

/**
 * 	������
 */
class Hippo extends Animal{
	String BiteForce;
	
	public void hunt() {}
}