package com.qf.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo08 {
	public static void main(String[] args) {
		/**
		 * 	LinkedList() 
			          ����һ�����б� 
			LinkedList(Collection<? extends E> c) 
			          ����һ������ָ�� collection �е�Ԫ�ص��б���ЩԪ�ذ��� collection �ĵ��������ص�˳�����С� 
		 */
		
		LinkedList list01 = new LinkedList();
		System.out.println(list01);
		
		ArrayList list = new ArrayList();
		list.add("���ܾ�");
		list.add("�׹Ǿ�");
		list.add("��������");
		list.add("��������");
		
		LinkedList list02 = new LinkedList(list);
		System.out.println(list02);
	}
}
