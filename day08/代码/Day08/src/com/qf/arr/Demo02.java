package com.qf.arr;

public class Demo02 {
	public static void main(String[] args) {
		int num = 33;
		System.out.println(num);
		
		changeNum(num);
		System.out.println(num);
	}
	
	public static void changeNum(int n) {
		n = 55;
	}
}
