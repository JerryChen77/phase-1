package com.qf.coll;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	增
		 *   boolean add(E e) 
			          确保此 collection 包含指定的元素（可选操作）。 
			 boolean addAll(Collection<? extends E> c) 
			          将指定 collection 中的所有元素都添加到此 collection 中（可选操作）。
			           
		 * 	改
		 
		 * 	查
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
		System.out.println(c);
		
		c.add("床前明月光");
		System.out.println(c);
		System.out.println(c.size());
		
		c.add(true);
		c.add(3.14);
		c.add(3.14);
		c.add(110);
		c.add(new Stu("张飒", 23));
		
		System.out.println(c);
		System.out.println(c.size());
		
		Collection cc = new ArrayList();
		cc.add(false);
		cc.add(3.1415926);
		
		// 集合整个放入集合
		//c.add(cc);
		System.out.println(c);
		
		// 把集合元素取出放入本集合
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
