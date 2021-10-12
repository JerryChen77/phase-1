package com.qf.list;

import java.util.ArrayList;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 *	删
			 E remove(int index) 
			          移除此列表中指定位置上的元素。 
			 boolean remove(Object o) 
			          移除此列表中首次出现的指定元素（如果存在）。 
			 removeAll
			 retainAll
			 void clear() 
			          移除此列表中的所有元素。 
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
		
		// 移除此列表中首次出现的指定元素（如果存在）
		boolean b = list.remove("白骨精");
		System.out.println(b);
		b = list.remove("白骨精");
		System.out.println(b);
		
		Object obj = list.remove(0);
		System.out.println(obj);
		
		list.add(3);
		System.out.println(list);
		
		// 按照索引移除
		list.remove(new Integer(3));
		System.out.println(list);
		
		ArrayList list0 = new ArrayList();
		list0.add("赤脚大仙");
		list0.add("土地公公");
		list0.add("红孩儿");
		list0.add("羊力大仙");
		
		// 只要两个集合有交集就返回true
		b = list.removeAll(list0);
		System.out.println(b);
		list.add("羊力大仙");
		System.out.println(list);
		System.out.println(list0);
		
		// 取交集
		list.retainAll(list0);
		System.out.println(list);
	}
}
