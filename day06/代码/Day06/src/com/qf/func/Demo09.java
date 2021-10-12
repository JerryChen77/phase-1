package com.qf.func;

public class Demo09 {
	public static void main(String[] args) {
		int sum = add2num(55, 66);
		System.out.println(sum);
		
	}
	
	/**
	 * 	计算两个整数的和
	 * @param a	第一个整数
	 * @param b	第二个整数
	 * @return	相加的结果
	 */
	public static int add2num(int a,int b) {
		int sum = a + b;
		return sum;
		// return sum;
		// System.out.println();	
	}
	
}
