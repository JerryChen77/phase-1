package com.qf.arr;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	自我介绍
		 * 		名字
		 * 		名字、年龄
		 * 		名字、年龄、地址
		 * 		名字、专业
		 * 		名字、备注
		 * 
		 * 	自我介绍的方法
		 * 	show
		 * 
		 *	虚拟机通过方法的声明部分区分方法
		 *		方法有两个部分
		 *			声明
		 *				参数列表鸡以及之前的所有你
		 *			实现
		 *				{}中的所有内容
		 *	
		 *	同一个类中出现了名字相同的方法，它们的参数列表不同
		 *		方法重载
		 */
		
		show("张三", 23);
		
		show("lisisi");
		
		
	}
	
	public static void show(String name) {
		System.out.println("我是:" + name);
	}
	
	public static void show(String name,int age) {
		System.out.println("我是:" + name + ",今年:" + age);
	}
	
}
