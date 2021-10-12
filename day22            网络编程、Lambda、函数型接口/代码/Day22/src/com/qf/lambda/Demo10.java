package com.qf.lambda;

import java.util.ArrayList;

public class Demo10 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("张三");
		names.add("李四");
		names.add("张武");
		names.add("赵柳");
		
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("===============");
		
		names.stream().forEach(System.out::println);
	}
}
