package com.qf.set;

import java.util.HashSet;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	增
		 *   boolean add(E e) 
			          如果此 set 中尚未包含指定元素，则添加指定元素。 
			 addAll
			 
		 * 	删
			 void clear() 
			          从此 set 中移除所有元素。 
			 boolean remove(Object o) 
			          如果指定元素存在于此 set 中，则将其移除。 
			 removeAll 
			 retainAll
			 
		 * 	查
			 boolean contains(Object o) 
			          如果此 set 包含指定元素，则返回 true。 
			 boolean isEmpty() 
			          如果此 set 不包含任何元素，则返回 true。 
			 Iterator<E> iterator() 
			          返回对此 set 中元素进行迭代的迭代器。 
			 int size() 
			          返回此 set 中的元素的数量（set 的容量）。 
			 equals
			 containsAll
		 */
		
		HashSet<String> set = new HashSet<String>();
		set.add("宋江");
		set.add("时迁");
		set.add("燕青");
		set.add("林冲");
		// 无序
		System.out.println(set);
		
		// 不能重复
		set.add("林冲");
		set.add("林冲");
		System.out.println(set);
		
	}
}
