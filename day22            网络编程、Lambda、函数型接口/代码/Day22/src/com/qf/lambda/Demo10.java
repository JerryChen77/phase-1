package com.qf.lambda;

import java.util.ArrayList;

public class Demo10 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("����");
		names.add("����");
		names.add("����");
		names.add("����");
		
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("===============");
		
		names.stream().forEach(System.out::println);
	}
}
