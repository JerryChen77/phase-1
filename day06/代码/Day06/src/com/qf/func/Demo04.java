package com.qf.func;

public class Demo04 {
	public static void main(String[] args) {
		System.out.println("main方法开始...");
		/**
		 * 	被调用的方法会比所在的方法先执行结束
		 * 	被调用的方法执行结束后从方法的位置继续向下执行
		 */
		show();
		
		System.out.println("main方法jieshu...");
	}
	
	public static void show() {
		System.out.println("\tshow方法开始...");
		
		System.out.println("\t\tshow中输出HelloWorld...........");
		
		System.out.println("\tshow方法结束...");
	}
	
}
