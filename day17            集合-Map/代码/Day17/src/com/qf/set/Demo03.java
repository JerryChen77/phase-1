package com.qf.set;

import java.util.HashSet;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	��
		 *   boolean add(E e) 
			          ����� set ����δ����ָ��Ԫ�أ������ָ��Ԫ�ء� 
			 addAll
			 
		 * 	ɾ
			 void clear() 
			          �Ӵ� set ���Ƴ�����Ԫ�ء� 
			 boolean remove(Object o) 
			          ���ָ��Ԫ�ش����ڴ� set �У������Ƴ��� 
			 removeAll 
			 retainAll
			 
		 * 	��
			 boolean contains(Object o) 
			          ����� set ����ָ��Ԫ�أ��򷵻� true�� 
			 boolean isEmpty() 
			          ����� set �������κ�Ԫ�أ��򷵻� true�� 
			 Iterator<E> iterator() 
			          ���ضԴ� set ��Ԫ�ؽ��е����ĵ������� 
			 int size() 
			          ���ش� set �е�Ԫ�ص�������set ���������� 
			 equals
			 containsAll
		 */
		
		HashSet<String> set = new HashSet<String>();
		set.add("�ν�");
		set.add("ʱǨ");
		set.add("����");
		set.add("�ֳ�");
		// ����
		System.out.println(set);
		
		// �����ظ�
		set.add("�ֳ�");
		set.add("�ֳ�");
		System.out.println(set);
		
	}
}
