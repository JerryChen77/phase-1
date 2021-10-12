package com.qf.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Demo09 {
	public static void main(String[] args) {
		/**
		 * 	增
			 void addFirst(E e) 
			          将指定元素插入此列表的开头。 
			 void addLast(E e) 
			          将指定元素添加到此列表的结尾。 
			 void push(E e) 
			          将元素推入此列表所表示的堆栈。 
			 boolean offer(E e) 
			          将指定元素添加到此列表的末尾（最后一个元素）。 
			 boolean offerFirst(E e) 
			          在此列表的开头插入指定的元素。 
			 boolean offerLast(E e) 
			          在此列表末尾插入指定的元素。 
			          
		 * 	删
			 E poll() 
			          获取并移除此列表的头（第一个元素） 
			 E pollFirst() 
			          获取并移除此列表的第一个元素；如果此列表为空，则返回 null。 
			 E pollLast() 
			          获取并移除此列表的最后一个元素；如果此列表为空，则返回 null。 
			 E pop() 
			          从此列表所表示的堆栈处弹出一个元素。 
			 E remove() 
			          获取并移除此列表的头（第一个元素）。 
			 E removeFirst() 
			          移除并返回此列表的第一个元素。 
			 boolean removeFirstOccurrence(Object o) 
			          从此列表中移除第一次出现的指定元素（从头部到尾部遍历列表时）。 
			 E removeLast() 
			          移除并返回此列表的最后一个元素。 
			 boolean removeLastOccurrence(Object o) 
			          从此列表中移除最后一次出现的指定元素（从头部到尾部遍历列表时）。 
			          
		 * 	查
			 Iterator<E> descendingIterator() 
			          返回以逆向顺序在此双端队列的元素上进行迭代的迭代器。 
			 E element() 
			          获取但不移除此列表的头（第一个元素）。 
			 E getFirst() 
			          返回此列表的第一个元素。 
			 E getLast() 
			          返回此列表的最后一个元素。 
			 E peek() 
			          获取但不移除此列表的头（第一个元素）。 
			 E peekFirst() 
			          获取但不移除此列表的第一个元素；如果此列表为空，则返回 null。 
			 E peekLast() 
			          获取但不移除此列表的最后一个元素；如果此列表为空，则返回 null。 
		 */
		
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("狮子精");
		list.add("白骨精");
		list.add("鹿力大仙");
		list.add("虎力大仙");
		list.add("白骨精");
		list.add("羊力大仙");
		
		LinkedList linkedList = new LinkedList(list);
		System.out.println(linkedList);
		
		linkedList.addFirst("奔波儿灞");
		System.out.println(linkedList);
		
		linkedList.addLast("霸波尔奔");
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
		
		linkedList.push("金角大王");
		System.out.println(linkedList);
		
		Object remove = linkedList.remove();
		System.out.println(remove);
		System.out.println(linkedList);
		
		boolean firstOccurrence = linkedList.removeFirstOccurrence("白骨精");
		System.out.println(linkedList);
		
		boolean lastOccurrence = linkedList.removeLastOccurrence("白骨精");
		System.out.println(linkedList);
		
		System.out.println("=================================");
		
		// 倒序迭代集合
		Iterator dit = linkedList.descendingIterator();
		while (dit.hasNext()) {
			Object object = (Object) dit.next();
			System.out.println(object);
		}
		
		
		linkedList.offer("孔雀公主");
		System.out.println(linkedList);
		
		linkedList.offerFirst("兔子精");
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
