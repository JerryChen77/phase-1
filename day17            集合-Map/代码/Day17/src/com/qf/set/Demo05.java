package com.qf.set;

import java.util.LinkedHashSet;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	LinkedHashSet() 
			          构造一个带默认初始容量 (16) 和加载因子 (0.75) 的新空链接哈希 set。 
			LinkedHashSet(Collection<? extends E> c) 
			          构造一个与指定 collection 中的元素相同的新链接哈希 set。 
			LinkedHashSet(int initialCapacity) 
			          构造一个带指定初始容量和默认加载因子 (0.75) 的新空链接哈希 set。 
			LinkedHashSet(int initialCapacity, float loadFactor) 
			          构造一个带有指定初始容量和加载因子的新空链接哈希 set。 
		 */
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		// 放入和取出顺序一致
		set.add("宋江");
		set.add("时迁");
		set.add("燕青");
		set.add("林冲");
		System.out.println(set);
		
		// 不重复
		set.add("燕青");
		set.add("燕青");
		System.out.println(set);
		
	}
}
