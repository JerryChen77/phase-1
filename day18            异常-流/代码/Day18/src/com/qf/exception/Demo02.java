package com.qf.exception;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println("main开始...");

		show01();

		System.out.println("main结束...");
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

		System.out.println(10 / 0);
			
		System.out.println("show03结束...");

	}
}
