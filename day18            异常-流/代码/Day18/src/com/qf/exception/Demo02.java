package com.qf.exception;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println("main��ʼ...");

		show01();

		System.out.println("main����...");
	}

	public static void show01() {
		System.out.println("show01��ʼ...");

		show02();
			
		System.out.println("show01����...");

	}

	public static void show02() {
		System.out.println("show02��ʼ...");

		show03();
			
		System.out.println("show02����...");

	}
	
	public static void show03() {
		System.out.println("show03��ʼ...");

		System.out.println(10 / 0);
			
		System.out.println("show03����...");

	}
}
