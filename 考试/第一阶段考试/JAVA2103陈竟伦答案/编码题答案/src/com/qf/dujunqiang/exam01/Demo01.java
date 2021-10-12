package com.qf.dujunqiang.exam01;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * (一) 键盘录入三个数字，比较他们的大小顺序
		 * 33	22	11
		 * 33	11	22
		 * 
		 * 11	33	22
		 * 22	33	11
		 * 
		 * 11	22	33	
		 * 22	11	33
		 */
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();

		if (a > b && b > c ) {
			System.out.println("a是最大的:a=" + a);
			System.out.println("b是中间数的:b=" + b);
			System.out.println("c是最小的:c=" + c);
		} else if(a > c && c > b){
			System.out.println("a是最大的:a=" + a);
			System.out.println("c是中间数的:c=" + c);
			System.out.println("b是最小的:b=" + b);
		} else if(b > a && a > c){
			System.out.println("b是最大的:b=" + b);
			System.out.println("a是中间数的:a=" + a);
			System.out.println("c是最小的:c=" + c);
		} else if(b > c && c > a){
			System.out.println("b是最大的:b=" + b);
			System.out.println("c是中间数的:c=" + c);
			System.out.println("a是最小的:a=" + a);
		} else if(c > a && a > b){
			System.out.println("c是最大的:c=" + c);
			System.out.println("a是中间数的:a=" + a);
			System.out.println("b是最小的:b=" + b);
		} else if(c > b && b > a){
			System.out.println("c是最大的:c=" + c);
			System.out.println("b是中间数的:b=" + b);
			System.out.println("a是最小的:a=" + a);
		} else {
			System.out.println("有数字出现了相等的情况。。。");
		}
	}
}
