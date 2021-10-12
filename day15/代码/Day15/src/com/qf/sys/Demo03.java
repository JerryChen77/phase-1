package com.qf.sys;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * break
		 * 	终止switch或者循环
		 * return
		 * 	结束方法，返回结果
		 * exit
		 * 	终止虚拟机
		 */
		
		System.out.println("main方法开始...");
		
		show();
		
		System.out.println("main方法结束...");
		
	}
	
	public static void show() {
		System.out.println("show方法开始...");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 6) {
				// break;
				// return;
				System.exit(0);
			}
		}
		
		System.out.println("show方法结束...");
	}
	
}
