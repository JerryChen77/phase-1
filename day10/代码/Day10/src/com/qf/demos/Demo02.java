package com.qf.demos;

public class Demo02 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1==s2);
		
		String s3 = new String("Hello");
		
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println(s1 == s3);
		
		String s5 = "Hello";
		String s6 = "World";
		String s7 = "HelloWorld";
		
		System.out.println(s5 == "Hello");
		
		System.out.println(s7 == "HelloWorld");
		System.out.println((s5+s6) == "HelloWorld");
	}
}
