package com.qf.func;

public class Demo06 {
	public static void main(String[] args) {
		getDouble(55);
		
		getSum(33, 55);
		
		show("张三", 23);
		
		// 传入参数的时候注意参数的顺序
		show("lisisi", 24);
	}
	
	/**
	 * 	获取数字的平方
	 * @param a
	 */
	public static void getDouble(int a) {
		System.out.println("a的平方是:"+a*a);
	}
	
	/**
	 * 	两个数据相加的结果
	 * @param a
	 * @param b
	 */
	public static void getSum(int a,int b) {
		System.out.println("a和b的和是:" + (a+b));
	}
	
	public static void show(String name,int age) {
		System.out.println("我是:" + name + ",今年:" + age);
	}
	
}
