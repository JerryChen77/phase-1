package com.qf.list;

import java.util.ArrayList;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	��
			 boolean contains(Object o) 
			          ������б��а���ָ����Ԫ�أ��򷵻� true�� 
			 containsAll
			 E get(int index) 
			          ���ش��б���ָ��λ���ϵ�Ԫ�ء� 
			 int indexOf(Object o) 
			          ���ش��б����״γ��ֵ�ָ��Ԫ�ص���������������б�����Ԫ�أ��򷵻� -1�� 
			 boolean isEmpty() 
			          ������б���û��Ԫ�أ��򷵻� true 
			 int lastIndexOf(Object o) 
			          ���ش��б������һ�γ��ֵ�ָ��Ԫ�ص���������������б������������򷵻� -1�� 
			 int size() 
			          ���ش��б��е�Ԫ������ 
		 */
		
		ArrayList list = new ArrayList();
		list.add("���ܾ�");
		list.add("�׹Ǿ�");
		list.add("�׹Ǿ�");
		list.add("ʨ�Ӿ�");
		list.add("¹������");
		list.add("��������");
		list.add("��������");
		System.out.println(list);
		
		boolean b = list.contains("�׹Ǿ�");
		System.out.println(b);
		
		ArrayList list0 = new ArrayList();
		list0.add("��Ŵ���");
		list0.add("���ع���");
		list0.add("�캢��");
		list0.add("��������");
		
		System.out.println(list.containsAll(list0));
		
		ArrayList list00 = new ArrayList();
		list00.add("��Ŵ���");
		list00.add("���ع���");
		list00.add("��������");
		list00.add("�캢��");
		list00.add("�캢��");
		
		System.out.println(list0.containsAll(list00));
		System.out.println(list0.equals(list00));
		
		System.out.println(list.get(3));
		System.out.println(list.indexOf("�׹Ǿ�"));
		System.out.println(list.lastIndexOf("�׹Ǿ�"));
		System.out.println(list.size());
		
	}
}
