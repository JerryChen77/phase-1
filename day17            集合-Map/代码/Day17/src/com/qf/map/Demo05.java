package com.qf.map;

import java.util.HashMap;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 *	ɾ
			 V remove(Object key) 
			          �Ӵ�ӳ�����Ƴ�ָ������ӳ���ϵ��������ڣ���
		     void clear() 
			          �Ӵ�ӳ�����Ƴ�����ӳ���ϵ�� 
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�й���ͨ", "10010");
		map.put("�й��ƶ�", "10086");
		map.put("�й�����", "10000");
		map.put("�й�����", "95580");
		map.put("�й�����", "95555");
		System.out.println(map);
		
		// �Ӵ�ӳ�����Ƴ�ָ������ӳ���ϵ��������ڣ���
		String str = map.remove("�й��ƶ�");
		System.out.println(str);
		
		System.out.println(map);
		
		// ��֤��ȫ
		boolean b = map.remove("�й�����","95550");
		System.out.println(b);
		System.out.println(map);
		
	}
}
