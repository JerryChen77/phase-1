package com.qf.ChenJIngLun.exam01;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		System.out.println("请输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(num + "=");
		for (int i = 2; i < num; i++) {
			while (num != i) {
				if (num % i == 0) {
					System.out.print(i + "*");
					num = num / i;
				} else {
					break;
				}
			}
		}
		System.out.println(num);
	}
}
	
