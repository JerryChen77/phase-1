package com.qf.obj;

public class Demo05 {
	static int num = 110;
	public static void main(String[] args) {
		/**
		 * 	局部变量
		 * 		定义在方法中,或者方法声明上
		 * 		使用之前必须赋值
		 * 		运行在栈中
		 * 		声明周期<=方法
		 */
		// int num = 10;
		System.out.println(num);
	}
	
	// 类方法
	public static void show() {
		int num = 0;
		System.out.println(num);
	}
	
	// 实例方法
	public void show00() {}
}
