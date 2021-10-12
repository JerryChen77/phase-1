package com.qf.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	键盘录入数字，计算100除以这个数字的结果
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字被100除:");
		
		
		try {
			int num = sc.nextInt();
			System.out.println(100 / num);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.err.println("除数不能为0，有问题");
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.err.println("输入的数字必须是整数");
			System.out.println(10 / 0);
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println("未知异常");
		} finally {
			System.out.println("程序终止");
		}
		
		
	}
}
