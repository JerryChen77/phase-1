package com.qf.list;

import java.util.ArrayList;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	��
		 * 	 boolean add(E e) 
			          ��ָ����Ԫ����ӵ����б��β���� 
			 void add(int index, E element) 
			          ��ָ����Ԫ�ز�����б��е�ָ��λ�á� 
			 boolean addAll(Collection<? extends E> c) 
			          ����ָ�� collection �ĵ����������ص�Ԫ��˳�򣬽��� collection �е�����Ԫ����ӵ����б��β���� 
			 boolean addAll(int index, Collection<? extends E> c) 
			          ��ָ����λ�ÿ�ʼ����ָ�� collection �е�����Ԫ�ز��뵽���б��С� 

		 */
		
		ArrayList list = new ArrayList();
		list.add("���ܾ�");
		list.add("�׹Ǿ�");
		list.add("ʨ�Ӿ�");
		list.add("¹������");
		list.add("��������");
		list.add("��������");
		
		System.out.println(list);
		
		// ��ָ��λ�ò�������
		list.add(0, "�������");
		System.out.println(list);
		
		ArrayList list0 = new ArrayList();
		list0.add("��Ŵ���");
		list0.add("���ع���");
		list0.add("�캢��");
		
		System.out.println(list0);
		
		list.addAll(list0);
		System.out.println(list);
		
		list.addAll(0, list0);
		System.out.println(list);
	}
}
