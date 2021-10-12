package com.qf.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Demo07 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		list.add("ºÚÐÜ¾«");
//		list.add("°×¹Ç¾«");
//		list.add("»¢Á¦´óÏÉ");
//		list.add("ÑòÁ¦´óÏÉ");
		System.out.println(list);
		
		Vector vector = new Vector();
//		vector.add("ºÚÐÜ¾«");
//		vector.add("°×¹Ç¾«");
//		vector.add("»¢Á¦´óÏÉ");
//		vector.add("ÑòÁ¦´óÏÉ");
		System.out.println(vector);
		
		addData(list);
		System.out.println("================");
		addData(vector);
		
	}
	
	public static void addData(List list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add(Math.random() + "===" + i);
		}
		
		System.out.println(System.currentTimeMillis() - startTime);
		
	}
	
}
