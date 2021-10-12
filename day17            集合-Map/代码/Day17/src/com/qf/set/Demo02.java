package com.qf.set;

import java.util.HashSet;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	HashSet() 
			          构造一个新的空 set，其底层 HashMap 实例的默认初始容量是 16，加载因子是 0.75。 
			HashSet(Collection<? extends E> c) 
			          构造一个包含指定 collection 中的元素的新 set。 
			HashSet(int initialCapacity) 
			          构造一个新的空 set，其底层 HashMap 实例具有指定的初始容量和默认的加载因子（0.75）。 
			HashSet(int initialCapacity, float loadFactor) 
			          构造一个新的空 set，其底层 HashMap 实例具有指定的初始容量和指定的加载因子。 
		 */
		// 构造一个新的空 set，其底层 HashMap 实例的默认初始容量是 16，加载因子是 0.75。 
		HashSet<String> set01 = new HashSet<String>();
		set01.add("abc");
		System.out.println(set01);
		System.out.println(set01.size());
		
		HashSet<String> set02 = new HashSet<String>(set01);
		System.out.println(set02);
		
		HashSet<String> set03 = new HashSet<String>(10000);
		System.out.println(set03);
		System.out.println(set03);
		
		HashSet<String> set04 = new HashSet<String>(10000,0.8F);
		System.out.println(set04);
		
	}
}
