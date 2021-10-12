package com.qf.list;

import java.util.ArrayList;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	改
			 void ensureCapacity(int minCapacity) 
			          如有必要，增加此 ArrayList 实例的容量，以确保它至少能够容纳最小容量参数所指定的元素数。 
			 E set(int index, E element) 
			          用指定的元素替代此列表中指定位置上的元素。 
			 void trimToSize() 
			          将此 ArrayList 实例的容量调整为列表的当前大小。 
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
		
		list.set(0, "黑瞎子");
		System.out.println(list);
		
	}
}
