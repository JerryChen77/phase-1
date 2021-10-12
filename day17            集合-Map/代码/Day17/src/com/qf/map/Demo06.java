package com.qf.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	查
			 boolean containsKey(Object key) 
			          如果此映射包含对于指定键的映射关系，则返回 true。 
			 boolean containsValue(Object value) 
			          如果此映射将一个或多个键映射到指定值，则返回 true。 
			 V get(Object key) 
			          返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null。 
			 boolean isEmpty() 
			          如果此映射不包含键-值映射关系，则返回 true。 
			 int size() 
			          返回此映射中的键-值映射关系数。 
			          
			          
			 Set<K> keySet() 
			          返回此映射中所包含的键的 Set 视图。 
			 Collection<V> values() 
			          返回此映射所包含的值的 Collection 视图。 
			 Set<Map.Entry<K,V>> entrySet() 
			          返回此映射所包含的映射关系的 Set 视图。 
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("中国联通", "10010");
		map.put("中国移动", "10086");
		map.put("中国电信", "10000");
		map.put("中国邮政", "95580");
		map.put("中国招商", "95555");
		System.out.println(map);
		
		boolean b = map.containsKey("中国移动");
		System.out.println(b);
		
		boolean c = map.containsValue("10000");
		System.out.println(c);
		
		String str = map.get("中国邮政");
		System.out.println(str);
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.size());
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
	}
}
