package com.qf.map;

import java.util.HashMap;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	��
			 V put(K key, V value) 
			          �ڴ�ӳ���й���ָ��ֵ��ָ������ 
			 void putAll(Map<? extends K,? extends V> m) 
			          ��ָ��ӳ�������ӳ���ϵ���Ƶ���ӳ���У���Щӳ���ϵ���滻��ӳ��Ŀǰ���ָ��ӳ�������м�������ӳ���ϵ�� 
			          
		 * 	��
			 V put(K key, V value) 
			          �ڴ�ӳ���й���ָ��ֵ��ָ������ 
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		// ����
		map.put("�й���ͨ", "10010");
		map.put("�й��ƶ�", "10086");
		map.put("�й�����", "10000");
		map.put("�й�����", "95580");
		map.put("�й�����", "95555");
		System.out.println(map);
		
		// �����ظ�
		map.put("�й�����", "95555");
		System.out.println(map);
		
		// �޸�keyӳ���value
		map.put("�й�����", "95550");
		System.out.println(map);
		
	}
}
