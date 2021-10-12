package com.qf.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	          
		 * 	����
			 Object[] toArray() 
			          ���ʵ�˳�򣨴ӵ�һ�������һ��Ԫ�أ����ذ������б�������Ԫ�ص����顣 
			 iterator
			 listIterator
			 subList
		 */
		ArrayList list = new ArrayList();
		list.add("���ܾ�");
		list.add("�׹Ǿ�");
		list.add("��������");
		list.add("��������");
		
		System.out.println("===============for================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============while================");
		int index = 0;
		while (index < list.size()) {
			System.out.println(list.get(index));
			index++;
		}
		
		System.out.println("===============dowhile================");
		index = 0;
		do {
			System.out.println(list.get(index));
			index++;
		}while (index < list.size());
		
		System.out.println("===============foreach================");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===============iterator================");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		System.out.println("===============listIterator================");
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
	}
}
