package com.qf.list;

import java.util.ArrayList;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 *	ɾ
			 E remove(int index) 
			          �Ƴ����б���ָ��λ���ϵ�Ԫ�ء� 
			 boolean remove(Object o) 
			          �Ƴ����б����״γ��ֵ�ָ��Ԫ�أ�������ڣ��� 
			 removeAll
			 retainAll
			 void clear() 
			          �Ƴ����б��е�����Ԫ�ء� 
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
		
		// �Ƴ����б����״γ��ֵ�ָ��Ԫ�أ�������ڣ�
		boolean b = list.remove("�׹Ǿ�");
		System.out.println(b);
		b = list.remove("�׹Ǿ�");
		System.out.println(b);
		
		Object obj = list.remove(0);
		System.out.println(obj);
		
		list.add(3);
		System.out.println(list);
		
		// ���������Ƴ�
		list.remove(new Integer(3));
		System.out.println(list);
		
		ArrayList list0 = new ArrayList();
		list0.add("��Ŵ���");
		list0.add("���ع���");
		list0.add("�캢��");
		list0.add("��������");
		
		// ֻҪ���������н����ͷ���true
		b = list.removeAll(list0);
		System.out.println(b);
		list.add("��������");
		System.out.println(list);
		System.out.println(list0);
		
		// ȡ����
		list.retainAll(list0);
		System.out.println(list);
	}
}
