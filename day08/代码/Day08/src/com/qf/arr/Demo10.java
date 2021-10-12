package com.qf.arr;

public class Demo10 {
	public static void main(String[] args) {
		
	}
	
	public static void show(String...strs) {
		for (String str : strs) {
			System.out.println(str);
		}
	}
	
	public static void show(int age,String...strs) {
		System.out.println("我今年" + age);
		for (String str : strs) {
			System.out.println(str);
		}
	}
	
	public static void show(double d,int age,String...strs) {
		System.out.println("我今年" + age);
		for (String str : strs) {
			System.out.println(str);
		}
	}
	
}
