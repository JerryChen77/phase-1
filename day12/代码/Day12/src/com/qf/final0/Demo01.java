package com.qf.final0;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 常量
		 * 	字面值常量
		 * 		1,2,3,a,b,c
		 * 
		 * 	自定义常量
		 * 		自己根据程序需要定义的不可改变的数据
		 * 		圆周率π
		 */
		final String birthday = "1990-12-30";
		System.out.println("birthday = " + birthday);
		
		// final修饰的变量只能赋值一次
		// birthday = "1995-12-31";
		
		People p = new People();
		System.out.println(p.country);
		System.out.println(p.name);
		System.out.println(p.age);
		
		
	}
}

class People{
	// final修饰的成员变量必须赋值
	
	// 声明的同时直接赋值
	final String country;
	String name = "张三";
	int age;
	static String capital;
	
	{
		// 在构造代码块中赋值
		// country = "中华人民共和国";
	}
	
	public People() {
		super();
		// 可以在构造器中赋值--所有构造器必须都有赋值的操作
		this.country = "中华人民共和国";
	}

	public People(String country, String name, int age) {
		super();
		this.country = country;
		this.name = name;
		this.age = age;
	}
	
}

