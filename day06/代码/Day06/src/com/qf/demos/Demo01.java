package com.qf.demos;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 2����1-3+5-7+ ���� -99+101��ֵ
		 */
		
		// ����Ľ��
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
