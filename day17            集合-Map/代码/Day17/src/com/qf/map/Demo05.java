package com.qf.map;

import java.util.HashMap;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 *	删
			 V remove(Object key) 
			          从此映射中移除指定键的映射关系（如果存在）。
		     void clear() 
			          从此映射中移除所有映射关系。 
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("中国联通", "10010");
		map.put("中国移动", "10086");
		map.put("中国电信", "10000");
		map.put("中国邮政", "95580");
		map.put("中国招商", "95555");
		System.out.println(map);
		
		// 从此映射中移除指定键的映射关系（如果存在）。
		String str = map.remove("中国移动");
		System.out.println(str);
		
		System.out.println(map);
		
		// 保证安全
		boolean b = map.remove("中国招商","95550");
		System.out.println(b);
		System.out.println(map);
		
	}
}
