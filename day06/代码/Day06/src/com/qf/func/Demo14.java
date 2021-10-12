package com.qf.func;

public class Demo14 {
	static int count = 0;
	public static void main(String[] args) {
		System.out.println("main方法开始...");
		show();
		System.out.println("main方法jieshu...");
	}

	public static void show() {
		System.out.println("show方法开始...");
		System.out.println(++count);
		// 给一个适当出口
		if (count == 1000) {
			return;
		}
		show();
		System.out.println("show方法jieshu...");
	}
}
