package com.qf.demos;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 3、从键盘录入整数, 如果是1 ,打印 "学习java" , 如果是2, 打印"睡觉" , 如果是3,终止程序, 如果是其他数, 继续循环
		 */
		Scanner sc = new Scanner(System.in);
		
		
		out:while (true) {
			System.out.println("请输入一个整数(1 ,打印 \"学习java\" , 如果是2, 打印\"睡觉\" , 如果是3,终止程序):");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("学习Java");
				break out;
				
			case 2:
				System.out.println("睡觉");
				break out;
				
			case 3:
				System.out.println("终止程序...");
				break out;

			default:
				break;
			}
		}
		System.out.println("OVER");
	}
}
