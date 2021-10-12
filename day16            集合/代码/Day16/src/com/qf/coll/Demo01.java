package com.qf.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 *	查
			 boolean contains(Object o) 
			          如果此 collection 包含指定的元素，则返回 true。 
			 boolean containsAll(Collection<?> c) 
			          如果此 collection 包含指定 collection 中的所有元素，则返回 true。 
			 boolean equals(Object o) 
			          比较此 collection 与指定对象是否相等。 
			 int hashCode() 
			          返回此 collection 的哈希码值。 
			 boolean isEmpty() 
			          如果此 collection 不包含元素，则返回 true。 
			 int size() 
			          返回此 collection 中的元素数。 
			          
		 * 	其他
			 Iterator<E> iterator() 
			          返回在此 collection 的元素上进行迭代的迭代器。 
			 Object[] toArray() 
			          返回包含此 collection 中所有元素的数组。 
		 */
		
		Collection c = new ArrayList();
		c.add("刘备");
		c.add("关羽");
		c.add("张飞");
		c.add("赵云");
		System.out.println(c);
		
		System.out.println(c.contains("张飞"));
		System.out.println(c.contains("张飞飞"));
		
		Collection cc = new ArrayList();
		cc.add("张飞");
		cc.add("刘备");
		cc.add("赵云");
		cc.add("关羽");
		System.out.println(cc);
		System.out.println(c.containsAll(cc));
		System.out.println(c.equals(cc));
		
		cc.add("诸葛亮");
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
