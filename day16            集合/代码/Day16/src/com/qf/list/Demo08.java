package com.qf.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo08 {
	public static void main(String[] args) {
		/**
		 * 	LinkedList() 
			          构造一个空列表。 
			LinkedList(Collection<? extends E> c) 
			          构造一个包含指定 collection 中的元素的列表，这些元素按其 collection 的迭代器返回的顺序排列。 
		 */
		
		LinkedList list01 = new LinkedList();
		System.out.println(list01);
		
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("虎力大仙");
		list.add("羊力大仙");
		
		LinkedList list02 = new LinkedList(list);
		System.out.println(list02);
	}
}
