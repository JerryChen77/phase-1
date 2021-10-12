package com.qf.func;

public class Demo13 {
	public static void main(String[] args) {
		System.out.println("main方法开始....");
		show01();
		System.out.println("main方法jieshu...");
	}

	public static void show01() {
		System.out.println("show01开始...");
		show02();
		System.out.println("show01结束...");
	}

	public static void show02() {
		System.out.println("show02开始...");
		show03();
		System.out.println("show02结束...");
		
	}

	public static void show03() {
		System.out.println("show03开始...");
		System.out.println("HelloWorld!!!");
		System.out.println("show03结束...");
		
	}
}
