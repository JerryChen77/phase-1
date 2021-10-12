package com.qf.extend;

public class Demo01 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		
		Hippo hippo = new Hippo();
	}
}

/**
 * 	动物类
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
 * 	狮子类
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
 * 	蜜獾类
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
 * 	斑马类
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
 * 	河马类
 */
class Hippo extends Animal{
	String BiteForce;
	
	public void hunt() {}
}