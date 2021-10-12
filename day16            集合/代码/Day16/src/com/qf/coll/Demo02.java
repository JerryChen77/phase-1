package com.qf.coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("刘备");
		c.add("关羽");
		c.add("张飞");
		c.add("赵云");
		System.out.println(c);
		
		System.out.println("============foreach遍历集合===========");
		for (Object obj : c) {
			System.out.println(obj);
		}
		
		System.out.println("=============iterator=================");
		
		// 获取迭代器对象
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
