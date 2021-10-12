package com.qf.arr;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	动态创建数组
		 * 		只是创建数组,没有向数组中添加数据
		 * 	
		 * 	静态创建数组
		 * 		创建数组的同时,确定数组中的数据
		 */
		// 声明一个数组变量
		int[] arr01;
		// 创建数组对象
		arr01 = new int[5];
		
		System.out.println("======================");
		
		// 声明数组并创建数组对象
		int[] arr02 = new int[6];
		
		System.out.println("======================");
		
		// 创建数组并确定数组中的数据
		int[] arr03 = new int[] {11,22,33,44,55};
		
		// 静态创建简写方式--有些场景不适用
		int[] arr04 = {111,222,333,444,555,666};
		
		System.out.println("======================");
		int arr05[] = {};
	}
}
