package com.qf.map;

import java.util.HashMap;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	HashMap() 
			          ����һ������Ĭ�ϳ�ʼ���� (16) ��Ĭ�ϼ������� (0.75) �Ŀ� HashMap�� 
			HashMap(int initialCapacity) 
			          ����һ����ָ����ʼ������Ĭ�ϼ������� (0.75) �Ŀ� HashMap�� 
			HashMap(int initialCapacity, float loadFactor) 
			          ����һ����ָ����ʼ�����ͼ������ӵĿ� HashMap�� 
			HashMap(Map<? extends K,? extends V> m) 
			          ����һ��ӳ���ϵ��ָ�� Map ��ͬ���� HashMap�� 
		 */
		// ����һ������Ĭ�ϳ�ʼ���� (16) ��Ĭ�ϼ������� (0.75) �Ŀ� HashMap�� 
		HashMap<String, String> map = new HashMap<String, String>();
		
		// ָ����ʾ����ʹ��Ĭ�ϼ�������
		HashMap<String, String> map01 = new HashMap<String, String>(5000);
		
		HashMap<String, String> map02 = new HashMap<String, String>(map);
		
		// HashMap<String, Integer> map03 = new HashMap<String, Integer>(map);
		
	}
}
