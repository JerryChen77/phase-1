package com.qf.exception;

import java.util.HashMap;

public class Demo01 {
	public static void main(String[] args) {
		System.out.println("HelloWorld001");
		
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("HelloWorld001");
		System.out.println("HelloWorldºËÐÄ´úÂë10000000ÐÐ");
		System.out.println("HelloWorld001");
		System.out.println("HelloWorld001");
		
		HashMap<String, String> map = new HashMap<String, String>(100);
	}
}
