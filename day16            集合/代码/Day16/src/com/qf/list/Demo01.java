package com.qf.list;

import java.util.ArrayList;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	ArrayList() 
			          ����һ����ʼ����Ϊ 10 �Ŀ��б� 
			ArrayList(Collection<? extends E> c) 
			          ����һ������ָ�� collection ��Ԫ�ص��б���ЩԪ���ǰ��ո� collection �ĵ������������ǵ�˳�����еġ� 
			ArrayList(int initialCapacity) 
			          ����һ������ָ����ʼ�����Ŀ��б� 
		 */
		
		// Constructs an empty list with an initial capacity of ten.
		ArrayList list = new ArrayList();
		System.out.println(list);
		
		ArrayList list2 = new ArrayList(list);
		
		ArrayList list3 = new ArrayList(100);
		
	}
}
