package com.qf.arr;

public class Demo01 {
	public static void main(String[] args) {
		int sum = getSum(33,55);
		System.out.println(sum);
		
		show("张三",23,"杭州江干区九堡");
	}

	/**
	 * 	自我介绍的方法
	 * @param name	引用类型
	 * @param age	基本类型
	 * @param addr	引用类型
	 */
	public static void show(String name, int age, String addr) {
		System.out.println("我是:" + name + ",今年:" + age + ",来自:" + addr);
	}

	/**
	 * 	计算两个数字相加的结果
	 * @param i	基本类型
	 * @param j	基本类型
	 * @return	基本类型
	 */
	public static int getSum(int i, int j) {
		return i+j;
	}
	
	
}
