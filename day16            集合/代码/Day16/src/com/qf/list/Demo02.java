package com.qf.list;

import java.util.ArrayList;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	增
		 * 	 boolean add(E e) 
			          将指定的元素添加到此列表的尾部。 
			 void add(int index, E element) 
			          将指定的元素插入此列表中的指定位置。 
			 boolean addAll(Collection<? extends E> c) 
			          按照指定 collection 的迭代器所返回的元素顺序，将该 collection 中的所有元素添加到此列表的尾部。 
			 boolean addAll(int index, Collection<? extends E> c) 
			          从指定的位置开始，将指定 collection 中的所有元素插入到此列表中。 

		 */
		
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("狮子精");
		list.add("鹿力大仙");
		list.add("虎力大仙");
		list.add("羊力大仙");
		
		System.out.println(list);
		
		// 在指定位置插入数据
		list.add(0, "奔波儿灞");
		System.out.println(list);
		
		ArrayList list0 = new ArrayList();
		list0.add("赤脚大仙");
		list0.add("土地公公");
		list0.add("红孩儿");
		
		System.out.println(list0);
		
		list.addAll(list0);
		System.out.println(list);
		
		list.addAll(0, list0);
		System.out.println(list);
	}
}
