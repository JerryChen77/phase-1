package com.qf.list;

import java.util.ArrayList;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	��
			 void ensureCapacity(int minCapacity) 
			          ���б�Ҫ�����Ӵ� ArrayList ʵ������������ȷ���������ܹ�������С����������ָ����Ԫ������ 
			 E set(int index, E element) 
			          ��ָ����Ԫ��������б���ָ��λ���ϵ�Ԫ�ء� 
			 void trimToSize() 
			          ���� ArrayList ʵ������������Ϊ�б�ĵ�ǰ��С�� 
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
		
		list.set(0, "��Ϲ��");
		System.out.println(list);
		
	}
}
