package com.qf.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	          
		 * 	其他
			 Object[] toArray() 
			          按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组。 
			 iterator
			 listIterator
			 subList
		 */
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("虎力大仙");
		list.add("羊力大仙");
		
		System.out.println("===============for================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============while================");
		int index = 0;
		while (index < list.size()) {
			System.out.println(list.get(index));
			index++;
		}
		
		System.out.println("===============dowhile================");
		index = 0;
		do {
			System.out.println(list.get(index));
			index++;
		}while (index < list.size());
		
		System.out.println("===============foreach================");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===============iterator================");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		System.out.println("===============listIterator================");
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
	}
}
