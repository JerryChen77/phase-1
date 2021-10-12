package com.qf.this0;

public class Demo02 {
	public static void main(String[] args) {
		Plane p1 = new Plane("", "", "", "");
		p1.fly();
	}
}

class Plane{
	String brand;
	String model;
	String country;
	String price;
	int speed;
	String color;
	
	public Plane() {
		System.out.println("我是没有参数的构造器");
	}
	
	public Plane(String brand,String model,String price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		System.out.println("我是三个参数的构造器");
	}
	
	public Plane(String brand,String model,String country,String price) {
		// 构造器调用必须放在第一行
		this(brand, model, price);
		this.country = country;
		System.out.println("我是四个参数的构造器");
		// 构造器中可以调用实例方法和实例变量
		fly();
	}
	
	public void fly() {
		// 构造器调用必须在构造器中
		// this(brand, model, price);
		System.out.println("飞机可以在地面和天空行驶");
		// 调用实例方法
		this.attack();
	}
	
	public void attack() {
		System.out.println("有些飞机可以在战争中使用");
	}
	
}
