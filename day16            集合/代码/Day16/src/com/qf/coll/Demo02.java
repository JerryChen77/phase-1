package com.qf.coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("����");
		c.add("����");
		c.add("�ŷ�");
		c.add("����");
		System.out.println(c);
		
		System.out.println("============foreach��������===========");
		for (Object obj : c) {
			System.out.println(obj);
		}
		
		System.out.println("=============iterator=================");
		
		// ��ȡ����������
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println(it.hasNext());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		// System.out.println(it.next());
		 
		 */
		
	}
}
