package com.qf.str;

public class Demo03 {
	public static void main(String[] args) {
		// 对象从常量池中取出
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		String s3 = new String("World");
		String s4 = new String("World");
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		
		String str = "haha";
		str = "hehe";
		
	}
}
