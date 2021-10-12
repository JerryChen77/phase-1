package com.qf.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01 {
	public static void main(String[] args) {
		/**
			static <T> boolean addAll(Collection<? super T> c, T... elements) 
          		将所有指定元素添加到指定 collection 中。 
          
          	static <T> void fill(List<? super T> list, T obj) 
          		使用指定元素替换指定列表中的所有元素。 
          
			static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) 
				根据元素的自然顺序，返回给定 collection 的最大元素。 
			static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll) 
          		根据元素的自然顺序 返回给定 collection 的最小元素。 
          		
			static <T> boolean replaceAll(List<T> list, T oldVal, T newVal) 
          		使用另一个值替换列表中出现的所有某一指定值。 
			static void reverse(List<?> list) 
          		反转指定列表中元素的顺序。 
          
          	static void rotate(List<?> list, int distance) 
          		根据指定的距离轮换指定列表中的元素。 
			static void shuffle(List<?> list) 
          		使用默认随机源对指定列表进行置换。 

			static <T extends Comparable<? super T>> void sort(List<T> list) 
          		根据元素的自然顺序 对指定列表按升序进行排序。 
			static void swap(List<?> list, int i, int j) 
          		在指定列表的指定位置处交换元素。 
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
		
		// 将所有指定元素添加到指定 collection 中。
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
		
		// 使用默认随机源对指定列表进行置换。 
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
