package com.qf.func;

public class Demo08 {
	public static void main(String[] args) {
		int num;
		num = getSquare(5);
		System.out.println(num);
		
		int n = getSquare(6);
		System.out.println(n);
		
		System.out.println(getSquare(7));
		
		double d = getSquare(8);
		System.out.println(d);
	}
	
	/**
	 * 	计算数字的平方
	 * @param i	传入的数字
	 * @return	计算得到的结果
	 */
	public static int getSquare(int i) {
		return i*i;
	}
	
}
