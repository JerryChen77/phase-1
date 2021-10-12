package com.qf.demos;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 2、求1-3+5-7+ …… -99+101的值
		 */
		
		// 计算的结果
		int sum = 0;
		
		for (int i = 1; i <= 101; i+=4) {
			sum += i;
		}
		
		for (int i = 3; i <= 99; i+=4) {
			sum -= i;
		}
		System.out.println("sum = " + sum);
	}
}
