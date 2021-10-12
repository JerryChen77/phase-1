package com.qf.exception;

public class Demo05 {
	public static void main(String[] args) {
		System.out.println("HelloWorld001");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.err.println("算术运算异常");
		}
		
		System.out.println("HelloWorld002");
		try {
			System.out.println("Hello".charAt(110));
		} catch (StringIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.err.println("字符串索引越界");
		}
		
		System.out.println("HelloWorld003");
		String[] arr = new String[10];
		try {
			System.out.println(arr[10].length());
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println("数组下标越界");
		}
		
		System.out.println("HelloWorld004");
		try {
			System.out.println(arr[0].length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("HelloWorld005");
		System.out.println("HelloWorld006");
		System.out.println("HelloWorld007");
	}
}
