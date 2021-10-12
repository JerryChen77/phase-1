package com.qf.map;

import java.util.HashMap;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	HashMap() 
			          构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap。 
			HashMap(int initialCapacity) 
			          构造一个带指定初始容量和默认加载因子 (0.75) 的空 HashMap。 
			HashMap(int initialCapacity, float loadFactor) 
			          构造一个带指定初始容量和加载因子的空 HashMap。 
			HashMap(Map<? extends K,? extends V> m) 
			          构造一个映射关系与指定 Map 相同的新 HashMap。 
		 */
		// 构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap。 
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 指定出示容量使用默认加载因子
		HashMap<String, String> map01 = new HashMap<String, String>(5000);
		
		HashMap<String, String> map02 = new HashMap<String, String>(map);
		
		// HashMap<String, Integer> map03 = new HashMap<String, Integer>(map);
		
	}
}
