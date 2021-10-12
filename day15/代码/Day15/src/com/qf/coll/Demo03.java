package com.qf.coll;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 *	ɾ
			 boolean remove(Object o) 
			          �Ӵ� collection ���Ƴ�ָ��Ԫ�صĵ���ʵ����������ڵĻ�����ѡ�������� 
			 boolean removeAll(Collection<?> c) 
			          �Ƴ��� collection ����ЩҲ������ָ�� collection �е�����Ԫ�أ���ѡ�������� 
			 boolean retainAll(Collection<?> c) 
			          �������� collection ����ЩҲ������ָ�� collection ��Ԫ�أ���ѡ��������
			 void clear() 
			          �Ƴ��� collection �е�����Ԫ�أ���ѡ�������� 
		 */
		
		Collection c = new ArrayList();
		
		c.add("�ν�");
		c.add("�ν�");
		c.add("¬����");
		c.add("����");
		c.add("����ʤ");
		c.add("��ʤ");
		c.add("�ֳ�");
		c.add("����");
		c.add("������");
		c.add("����");
		
		// �Ƴ�ָ��Ԫ�صĵ���ʵ��
		boolean b = c.remove("�ν�");
		System.out.println(b);
		
		b = c.remove("�ν�");
		System.out.println(b);
		
		Collection cc = new ArrayList();
		
		cc.add("����");
		cc.add("��ֲ");
		cc.add("�˽���");
		cc.add("����");
		
		// �Ƴ����Ͻ�����������
		b = c.removeAll(cc);
		System.out.println(b);
		System.out.println(c);
		System.out.println(cc);
		
		b = c.removeAll(cc);
		System.out.println(b);
		System.out.println(c);
		System.out.println(cc);
		
		c.add("����");
		System.out.println(c);
		System.out.println(cc);
		
		// ֻ��������
		c.retainAll(cc);
		
		System.out.println(c);
		System.out.println(cc);
		
		c.clear();
		System.out.println(c);
		
	}
}
