package com.qf.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo10 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		addData(arrayList);
		System.out.println("---------");
		addData(linkedList);
		
		System.out.println("========================");
		
		queryData(arrayList);
		System.out.println("---------");
		queryData(linkedList);
		
	}
	
	/**
	 * 	插入数据
	 * @param list
	 */
	public static void addData(List list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(0,Math.random() + "===" + i);
		}
		System.out.println(System.currentTimeMillis() - startTime);
	}
	
	/**
	 * 	查询数据
	 * @param list
	 */
	public static void queryData(List list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.get(list.size()/2-1);
		}
		System.out.println(System.currentTimeMillis() - startTime);
	}
}
