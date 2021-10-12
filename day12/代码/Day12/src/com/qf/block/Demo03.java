package com.qf.block;

public class Demo03 {
	public static void main(String[] args) {
		Mouse m1 = new Mouse();
		Mouse m2 = new Mouse();
		Mouse m3 = new Mouse();
		Mouse m4 = new Mouse();
		Mouse m5 = new Mouse();
		
	}
}

class Mouse{
	String color;
	int price;
	static String type = "鼠标";
	
	static {
		// System.out.println(color);
		System.out.println(type);
		System.out.println("加载鼠标驱动...");
		show();
	}
	
	{
		System.out.println("我是动态代码块...,鼠标连接到电脑,正在启动程序...");
	}
	
	public Mouse() {
		super();
		System.out.println("我是构造器...");
	}

	public Mouse(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}
	
	public static void show() {}
	
}
