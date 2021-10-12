package com.qf.map;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo10 {
	public static void main(String[] args) {
		/**
		 * 	TreeMap() 
			          使用键的自然顺序构造一个新的、空的树映射。 
			TreeMap(Comparator<? super K> comparator) 
			          构造一个新的、空的树映射，该映射根据给定比较器进行排序。 
			TreeMap(Map<? extends K,? extends V> m) 
			          构造一个与给定映射具有相同映射关系的新的树映射，该映射根据其键的自然顺序 进行排序。 
			TreeMap(SortedMap<K,? extends V> m) 
			          构造一个与指定有序映射具有相同映射关系和相同排序顺序的新的树映射。 
		 */
		
		// 正序
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(10010, "中国联通");
		map.put(10000, "中国电信");
		map.put(10086, "中国移动");
		map.put(95555, "中国招商");
		System.out.println(map);
		
		// 倒序
		TreeMap<Integer, String> map0 = new TreeMap<Integer, String>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2-i1;
			}
		});
		
		map0.put(10010, "中国联通");
		map0.put(10000, "中国电信");
		map0.put(10086, "中国移动");
		map0.put(95555, "中国招商");
		System.out.println(map0);
		
		TreeMap<Student, String> stus = new TreeMap<Student, String>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int ret = s1.age - s2.age;
				if (ret == 0) {
					ret = s1.name.compareTo(s2.name);
				}
				return ret;
			}
		});
		
		stus.put(new Student("zhangsan", 23),"");
		stus.put(new Student("lisisi", 25),"");
		stus.put(new Student("wangwu", 20),"");
		stus.put(new Student("zhaoliu", 20),"");
		System.out.println(stus);
		
	}
}

class Student{
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
