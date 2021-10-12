package com.qf.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Demo09 {
	public static void main(String[] args) {
		/**
		 * 	��
			 void addFirst(E e) 
			          ��ָ��Ԫ�ز�����б�Ŀ�ͷ�� 
			 void addLast(E e) 
			          ��ָ��Ԫ����ӵ����б�Ľ�β�� 
			 void push(E e) 
			          ��Ԫ��������б�����ʾ�Ķ�ջ�� 
			 boolean offer(E e) 
			          ��ָ��Ԫ����ӵ����б��ĩβ�����һ��Ԫ�أ��� 
			 boolean offerFirst(E e) 
			          �ڴ��б�Ŀ�ͷ����ָ����Ԫ�ء� 
			 boolean offerLast(E e) 
			          �ڴ��б�ĩβ����ָ����Ԫ�ء� 
			          
		 * 	ɾ
			 E poll() 
			          ��ȡ���Ƴ����б��ͷ����һ��Ԫ�أ� 
			 E pollFirst() 
			          ��ȡ���Ƴ����б�ĵ�һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null�� 
			 E pollLast() 
			          ��ȡ���Ƴ����б�����һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null�� 
			 E pop() 
			          �Ӵ��б�����ʾ�Ķ�ջ������һ��Ԫ�ء� 
			 E remove() 
			          ��ȡ���Ƴ����б��ͷ����һ��Ԫ�أ��� 
			 E removeFirst() 
			          �Ƴ������ش��б�ĵ�һ��Ԫ�ء� 
			 boolean removeFirstOccurrence(Object o) 
			          �Ӵ��б����Ƴ���һ�γ��ֵ�ָ��Ԫ�أ���ͷ����β�������б�ʱ���� 
			 E removeLast() 
			          �Ƴ������ش��б�����һ��Ԫ�ء� 
			 boolean removeLastOccurrence(Object o) 
			          �Ӵ��б����Ƴ����һ�γ��ֵ�ָ��Ԫ�أ���ͷ����β�������б�ʱ���� 
			          
		 * 	��
			 Iterator<E> descendingIterator() 
			          ����������˳���ڴ�˫�˶��е�Ԫ���Ͻ��е����ĵ������� 
			 E element() 
			          ��ȡ�����Ƴ����б��ͷ����һ��Ԫ�أ��� 
			 E getFirst() 
			          ���ش��б�ĵ�һ��Ԫ�ء� 
			 E getLast() 
			          ���ش��б�����һ��Ԫ�ء� 
			 E peek() 
			          ��ȡ�����Ƴ����б��ͷ����һ��Ԫ�أ��� 
			 E peekFirst() 
			          ��ȡ�����Ƴ����б�ĵ�һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null�� 
			 E peekLast() 
			          ��ȡ�����Ƴ����б�����һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null�� 
		 */
		
		ArrayList list = new ArrayList();
		list.add("���ܾ�");
		list.add("�׹Ǿ�");
		list.add("ʨ�Ӿ�");
		list.add("�׹Ǿ�");
		list.add("¹������");
		list.add("��������");
		list.add("�׹Ǿ�");
		list.add("��������");
		
		LinkedList linkedList = new LinkedList(list);
		System.out.println(linkedList);
		
		linkedList.addFirst("�������");
		System.out.println(linkedList);
		
		linkedList.addLast("�Բ�����");
		System.out.println(linkedList);
		
		Object poll = linkedList.poll();
		System.out.println(poll);
		System.out.println(linkedList);
		System.out.println(linkedList);
		
		Object pollLast = linkedList.pollLast();
		System.out.println(pollLast);
		System.out.println(linkedList);
		
		Object pop = linkedList.pop();
		System.out.println(pop);
		System.out.println(linkedList);
		
		linkedList.push("��Ǵ���");
		System.out.println(linkedList);
		
		Object remove = linkedList.remove();
		System.out.println(remove);
		System.out.println(linkedList);
		
		boolean firstOccurrence = linkedList.removeFirstOccurrence("�׹Ǿ�");
		System.out.println(linkedList);
		
		boolean lastOccurrence = linkedList.removeLastOccurrence("�׹Ǿ�");
		System.out.println(linkedList);
		
		System.out.println("=================================");
		
		// �����������
		Iterator dit = linkedList.descendingIterator();
		while (dit.hasNext()) {
			Object object = (Object) dit.next();
			System.out.println(object);
		}
		
		
		linkedList.offer("��ȸ����");
		System.out.println(linkedList);
		
		linkedList.offerFirst("���Ӿ�");
		System.out.println(linkedList);
		
		Object element = linkedList.element();
		System.out.println(element);
		
		Object first = linkedList.getFirst();
		System.out.println(first);
		
		Object peekFirst = linkedList.peekFirst();
		System.out.println(peekFirst);
		
		Object peekLast = linkedList.peekLast();
		System.out.println(peekLast);
	}
}
