package com.qf.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo07 {
	public static void main(String[] args) {
		/**
		 * 	遍历Map集合
		 * 		索引遍历
		 * 		foreach
		 * 		迭代器
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("中国联通", "10010");
		map.put("中国移动", "10086");
		map.put("中国电信", "10000");
		map.put("中国邮政", "95580");
		map.put("中国招商", "95555");
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		
		System.out.println("==============keySet--foreach================");
		for (String key : keys) {
			System.out.println(key + "=============" + map.get(key));
		}
		
		System.out.println("==============keySet--iterator================");
		Iterator<String> keyIt = keys.iterator();
		while (keyIt.hasNext()) {
			String key = keyIt.next();
			System.out.println(key + "=============" + map.get(key));
		}
		
		System.out.println("==============entrySet--foreach================");
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + "====" + entry.getValue());
		}
		
		System.out.println("==============entrySet--iterator================");
		Iterator<Entry<String, String>> entryIt = entrySet.iterator();
		while (entryIt.hasNext()) {
			Entry<String,String> entry = entryIt.next();
			System.out.println(entry.getKey() + "====" + entry.getValue());
		}
	}
}
