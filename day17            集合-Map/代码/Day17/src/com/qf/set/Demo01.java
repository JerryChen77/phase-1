package com.qf.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01 {
	public static void main(String[] args) {
		/**
			static <T> boolean addAll(Collection<? super T> c, T... elements) 
          		������ָ��Ԫ����ӵ�ָ�� collection �С� 
          
          	static <T> void fill(List<? super T> list, T obj) 
          		ʹ��ָ��Ԫ���滻ָ���б��е�����Ԫ�ء� 
          
			static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) 
				����Ԫ�ص���Ȼ˳�򣬷��ظ��� collection �����Ԫ�ء� 
			static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll) 
          		����Ԫ�ص���Ȼ˳�� ���ظ��� collection ����СԪ�ء� 
          		
			static <T> boolean replaceAll(List<T> list, T oldVal, T newVal) 
          		ʹ����һ��ֵ�滻�б��г��ֵ�����ĳһָ��ֵ�� 
			static void reverse(List<?> list) 
          		��תָ���б���Ԫ�ص�˳�� 
          
          	static void rotate(List<?> list, int distance) 
          		����ָ���ľ����ֻ�ָ���б��е�Ԫ�ء� 
			static void shuffle(List<?> list) 
          		ʹ��Ĭ�����Դ��ָ���б�����û��� 

			static <T extends Comparable<? super T>> void sort(List<T> list) 
          		����Ԫ�ص���Ȼ˳�� ��ָ���б������������ 
			static void swap(List<?> list, int i, int j) 
          		��ָ���б��ָ��λ�ô�����Ԫ�ء� 
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(111);
		list.add(111);
		list.add(31);
		list.add(45642);
		list.add(42);
		list.add(78653);
		list.add(4);
		list.add(452);
		System.out.println(list);
		
		// ������ָ��Ԫ����ӵ�ָ�� collection �С�
		Collections.addAll(list, 123,12,132,147,159);
		System.out.println(list);
		
		// Collections.fill(list, 1111);
		System.out.println(list);
		
		Integer max = Collections.max(list);
		System.out.println(max);
		
		Integer min = Collections.min(list);
		System.out.println(min);
		
		Collections.replaceAll(list, 111, 1111111);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.rotate(list, 3);
		System.out.println(list);
		
		// ʹ��Ĭ�����Դ��ָ���б�����û��� 
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2-i1;
			}
		});
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.swap(list, 0, list.size()-1);
		System.out.println(list);
		
	}
}
