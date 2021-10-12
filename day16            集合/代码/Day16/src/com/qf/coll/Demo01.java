package com.qf.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 *	��
			 boolean contains(Object o) 
			          ����� collection ����ָ����Ԫ�أ��򷵻� true�� 
			 boolean containsAll(Collection<?> c) 
			          ����� collection ����ָ�� collection �е�����Ԫ�أ��򷵻� true�� 
			 boolean equals(Object o) 
			          �Ƚϴ� collection ��ָ�������Ƿ���ȡ� 
			 int hashCode() 
			          ���ش� collection �Ĺ�ϣ��ֵ�� 
			 boolean isEmpty() 
			          ����� collection ������Ԫ�أ��򷵻� true�� 
			 int size() 
			          ���ش� collection �е�Ԫ������ 
			          
		 * 	����
			 Iterator<E> iterator() 
			          �����ڴ� collection ��Ԫ���Ͻ��е����ĵ������� 
			 Object[] toArray() 
			          ���ذ����� collection ������Ԫ�ص����顣 
		 */
		
		Collection c = new ArrayList();
		c.add("����");
		c.add("����");
		c.add("�ŷ�");
		c.add("����");
		System.out.println(c);
		
		System.out.println(c.contains("�ŷ�"));
		System.out.println(c.contains("�ŷɷ�"));
		
		Collection cc = new ArrayList();
		cc.add("�ŷ�");
		cc.add("����");
		cc.add("����");
		cc.add("����");
		System.out.println(cc);
		System.out.println(c.containsAll(cc));
		System.out.println(c.equals(cc));
		
		cc.add("�����");
		System.out.println(c.containsAll(cc));
		
		System.out.println(cc.size());
		System.out.println(cc.isEmpty());
		cc.clear();
		System.out.println(cc.size());
		System.out.println(cc.isEmpty());
		
		Object[] objects = c.toArray();
		System.out.println(Arrays.toString(objects));
		
	}
}
