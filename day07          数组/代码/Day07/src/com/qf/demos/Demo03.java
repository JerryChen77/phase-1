package com.qf.demos;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	编写方法,输出2~~某个数之内的素数
		 * 	素数--质数
		 * 		只能被1和自身整除
		 * 
		 * 	10
		 * 	10/2
		 * 	10/3
		 *  10/4
		 *   
		 */
		printZhi(100);
	}
	
	public static void printZhi(int num) {
		for (int i = 2; i < num; i++) {
			// 假设一个数字是质数
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			
			// 判断flag是否被修改,如果没有被修改，没有整除的情况，是质数
			if (flag == true) {
				System.out.println(i);
			}
		}
	}
}
