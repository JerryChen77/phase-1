package com.qf.obj;

public class Demo07 {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.show();
		
		Tiger tiger2 = new Tiger();
		tiger2.show();
		
		Tiger tiger3 = new Tiger("华南虎", 2, "毛子哥");
		tiger3.show();
		
	}
}

class Tiger{
	String type;
	String name;
	int age;
	double weight;
	double length;
	String color;
	
	/**
	 * 	创建对象过程中调用的方法
	 * 	完成对象的初始化
	 * 	构造方法
	 * 	构造器
	 */
	public Tiger() {
		System.out.println("干什么用的方法????");
	}
	
	public Tiger(String t,int a,String n) {
		type = t;
		age = a;
		name = n;
	}
	
	public void show() {
		System.out.println("Tiger [type=" + type + ", name=" + name + ", age=" + age + ", weight=" + weight + ", length=" + length
				+ ", color=" + color + "]");
	}
	
}
