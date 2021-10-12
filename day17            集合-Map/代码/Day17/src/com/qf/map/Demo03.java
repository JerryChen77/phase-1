package com.qf.map;

import java.util.HashMap;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	增
			 V put(K key, V value) 
			          在此映射中关联指定值与指定键。 
			 void putAll(Map<? extends K,? extends V> m) 
			          将指定映射的所有映射关系复制到此映射中，这些映射关系将替换此映射目前针对指定映射中所有键的所有映射关系。 
			          
		 * 	改
			 V put(K key, V value) 
			          在此映射中关联指定值与指定键。 
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		// 无序
		map.put("中国联通", "10010");
		map.put("中国移动", "10086");
		map.put("中国电信", "10000");
		map.put("中国邮政", "95580");
		map.put("中国招商", "95555");
		System.out.println(map);
		
		// 不能重复
		map.put("中国招商", "95555");
		System.out.println(map);
		
		// 修改key映射的value
		map.put("中国招商", "95550");
		System.out.println(map);
		
	}
}
