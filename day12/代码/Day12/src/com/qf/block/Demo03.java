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
	static String type = "���";
	
	static {
		// System.out.println(color);
		System.out.println(type);
		System.out.println("�����������...");
		show();
	}
	
	{
		System.out.println("���Ƕ�̬�����...,������ӵ�����,������������...");
	}
	
	public Mouse() {
		super();
		System.out.println("���ǹ�����...");
	}

	public Mouse(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}
	
	public static void show() {}
	
}
