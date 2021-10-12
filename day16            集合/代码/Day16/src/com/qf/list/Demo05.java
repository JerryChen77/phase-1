package com.qf.list;

import java.util.ArrayList;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	查
			 boolean contains(Object o) 
			          如果此列表中包含指定的元素，则返回 true。 
			 containsAll
			 E get(int index) 
			          返回此列表中指定位置上的元素。 
			 int indexOf(Object o) 
			          返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。 
			 boolean isEmpty() 
			          如果此列表中没有元素，则返回 true 
			 int lastIndexOf(Object o) 
			          返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1。 
			 int size() 
			          返回此列表中的元素数。 
		 */
		
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("白骨精");
		list.add("狮子精");
		list.add("鹿力大仙");
		list.add("虎力大仙");
		list.add("羊力大仙");
		System.out.println(list);
		
		boolean b = list.contains("白骨精");
		System.out.println(b);
		
		ArrayList list0 = new ArrayList();
		list0.add("赤脚大仙");
		list0.add("土地公公");
		list0.add("红孩儿");
		list0.add("羊力大仙");
		
		System.out.println(list.containsAll(list0));
		
		ArrayList list00 = new ArrayList();
		list00.add("赤脚大仙");
		list00.add("土地公公");
		list00.add("羊力大仙");
		list00.add("红孩儿");
		list00.add("红孩儿");
		
		System.out.println(list0.containsAll(list00));
		System.out.println(list0.equals(list00));
		
		System.out.println(list.get(3));
		System.out.println(list.indexOf("白骨精"));
		System.out.println(list.lastIndexOf("白骨精"));
		System.out.println(list.size());
		
	}
}
