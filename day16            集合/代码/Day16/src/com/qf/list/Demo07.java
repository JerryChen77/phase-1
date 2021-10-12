package com.qf.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Demo07 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		list.add("���ܾ�");
//		list.add("�׹Ǿ�");
//		list.add("��������");
//		list.add("��������");
		System.out.println(list);
		
		Vector vector = new Vector();
//		vector.add("���ܾ�");
//		vector.add("�׹Ǿ�");
//		vector.add("��������");
//		vector.add("��������");
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
