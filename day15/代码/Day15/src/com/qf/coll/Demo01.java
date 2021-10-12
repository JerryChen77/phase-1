package com.qf.coll;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	��
		 *   boolean add(E e) 
			          ȷ���� collection ����ָ����Ԫ�أ���ѡ�������� 
			 boolean addAll(Collection<? extends E> c) 
			          ��ָ�� collection �е�����Ԫ�ض���ӵ��� collection �У���ѡ��������
			           
		 * 	��
		 
		 * 	��
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
		System.out.println(c);
		
		c.add("��ǰ���¹�");
		System.out.println(c);
		System.out.println(c.size());
		
		c.add(true);
		c.add(3.14);
		c.add(3.14);
		c.add(110);
		c.add(new Stu("���", 23));
		
		System.out.println(c);
		System.out.println(c.size());
		
		Collection cc = new ArrayList();
		cc.add(false);
		cc.add(3.1415926);
		
		// �����������뼯��
		//c.add(cc);
		System.out.println(c);
		
		// �Ѽ���Ԫ��ȡ�����뱾����
		c.addAll(cc);
		System.out.println(c);
	}
}

class Stu{
	String name;
	int age;
	
	public Stu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + "]";
	}
}
