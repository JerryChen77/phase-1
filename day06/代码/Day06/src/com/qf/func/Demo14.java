package com.qf.func;

public class Demo14 {
	static int count = 0;
	public static void main(String[] args) {
		System.out.println("main������ʼ...");
		show();
		System.out.println("main����jieshu...");
	}

	public static void show() {
		System.out.println("show������ʼ...");
		System.out.println(++count);
		// ��һ���ʵ�����
		if (count == 1000) {
			return;
		}
		show();
		System.out.println("show����jieshu...");
	}
}
