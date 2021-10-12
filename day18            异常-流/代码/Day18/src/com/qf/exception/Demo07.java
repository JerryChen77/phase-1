package com.qf.exception;

public class Demo07 {
	public static void main(String[] args) {
		try {
			System.out.println("HelloWorld001");
			// try代码块中遇到任何异常，后面的代码不会执行，执行catch中的代码
			System.out.println(10 / 0);
			
			System.out.println("HelloWorld002");
			System.out.println("Hello".charAt(110));
			
			System.out.println("HelloWorld003");
			String[] arr = new String[10];
			System.out.println(arr[10].length());
			
			System.out.println("HelloWorld004");
			System.out.println(arr[0].length());
			
			System.out.println("HelloWorld005");
			System.out.println("HelloWorld006");
			System.out.println("HelloWorld007");
		} catch (Exception e) {
			System.err.println("代码有错误");
			// return;
			System.exit(0);
		} finally {
			System.out.println("OVER");
		}
	}
}
