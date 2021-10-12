package com.qf.static0;

public class Demo02 {
	public static void main(String[] args) {
		Korean k1 = new Korean();
		k1.name = "朴一万";
		k1.age = 45;
		k1.show();
		
		System.out.println("=====================");
		
		Korean k2 = new Korean();
		k2.name = "朴八千";
		k2.age = 25;
		k2.show();
		
		System.out.println("====================");
		
		// 修改成员变量--只对当前对象有影响
		k1.name = "朴百万";
		k1.show();
		
		k2.show();
		System.out.println("====================");
		
		// 修改类变量--所有此类对象都会受到影响
		Korean.capital = "首尔";
		k2.show();
		k1.show();
	}
}

class Korean{
	/**
	 * 实例属性
	 * 	实例变量
	 */
	String name;
	int age;
	/**
	 * 静态属性
	 * 	类变量
	 */
	static String capital = "汉城";
	
	public void show() {
		System.out.println("Korean [name=" + name + ", age=" + age + ", capital=" + capital + "]");
	}
	
}
