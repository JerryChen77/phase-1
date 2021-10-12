package com.qf.set;

import java.util.LinkedHashSet;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	LinkedHashSet() 
			          ����һ����Ĭ�ϳ�ʼ���� (16) �ͼ������� (0.75) ���¿����ӹ�ϣ set�� 
			LinkedHashSet(Collection<? extends E> c) 
			          ����һ����ָ�� collection �е�Ԫ����ͬ�������ӹ�ϣ set�� 
			LinkedHashSet(int initialCapacity) 
			          ����һ����ָ����ʼ������Ĭ�ϼ������� (0.75) ���¿����ӹ�ϣ set�� 
			LinkedHashSet(int initialCapacity, float loadFactor) 
			          ����һ������ָ����ʼ�����ͼ������ӵ��¿����ӹ�ϣ set�� 
		 */
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		// �����ȡ��˳��һ��
		set.add("�ν�");
		set.add("ʱǨ");
		set.add("����");
		set.add("�ֳ�");
		System.out.println(set);
		
		// ���ظ�
		set.add("����");
		set.add("����");
		System.out.println(set);
		
	}
}
