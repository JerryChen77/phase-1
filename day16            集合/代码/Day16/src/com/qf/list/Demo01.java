package com.qf.list;

import java.util.ArrayList;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	ArrayList() 
			          构造一个初始容量为 10 的空列表。 
			ArrayList(Collection<? extends E> c) 
			          构造一个包含指定 collection 的元素的列表，这些元素是按照该 collection 的迭代器返回它们的顺序排列的。 
			ArrayList(int initialCapacity) 
			          构造一个具有指定初始容量的空列表。 
		 */
		
		// Constructs an empty list with an initial capacity of ten.
		ArrayList list = new ArrayList();
		System.out.println(list);
		
		ArrayList list2 = new ArrayList(list);
		
		ArrayList list3 = new ArrayList(100);
		
	}
}
