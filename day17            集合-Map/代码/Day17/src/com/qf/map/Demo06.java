package com.qf.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	��
			 boolean containsKey(Object key) 
			          �����ӳ���������ָ������ӳ���ϵ���򷵻� true�� 
			 boolean containsValue(Object value) 
			          �����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true�� 
			 V get(Object key) 
			          ����ָ������ӳ���ֵ��������ڸü���˵����ӳ�䲻�����κ�ӳ���ϵ���򷵻� null�� 
			 boolean isEmpty() 
			          �����ӳ�䲻������-ֵӳ���ϵ���򷵻� true�� 
			 int size() 
			          ���ش�ӳ���еļ�-ֵӳ���ϵ���� 
			          
			          
			 Set<K> keySet() 
			          ���ش�ӳ�����������ļ��� Set ��ͼ�� 
			 Collection<V> values() 
			          ���ش�ӳ����������ֵ�� Collection ��ͼ�� 
			 Set<Map.Entry<K,V>> entrySet() 
			          ���ش�ӳ����������ӳ���ϵ�� Set ��ͼ�� 
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�й���ͨ", "10010");
		map.put("�й��ƶ�", "10086");
		map.put("�й�����", "10000");
		map.put("�й�����", "95580");
		map.put("�й�����", "95555");
		System.out.println(map);
		
		boolean b = map.containsKey("�й��ƶ�");
		System.out.println(b);
		
		boolean c = map.containsValue("10000");
		System.out.println(c);
		
		String str = map.get("�й�����");
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
