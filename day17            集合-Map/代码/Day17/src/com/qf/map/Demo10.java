package com.qf.map;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo10 {
	public static void main(String[] args) {
		/**
		 * 	TreeMap() 
			          ʹ�ü�����Ȼ˳����һ���µġ��յ���ӳ�䡣 
			TreeMap(Comparator<? super K> comparator) 
			          ����һ���µġ��յ���ӳ�䣬��ӳ����ݸ����Ƚ����������� 
			TreeMap(Map<? extends K,? extends V> m) 
			          ����һ�������ӳ�������ͬӳ���ϵ���µ���ӳ�䣬��ӳ������������Ȼ˳�� �������� 
			TreeMap(SortedMap<K,? extends V> m) 
			          ����һ����ָ������ӳ�������ͬӳ���ϵ����ͬ����˳����µ���ӳ�䡣 
		 */
		
		// ����
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(10010, "�й���ͨ");
		map.put(10000, "�й�����");
		map.put(10086, "�й��ƶ�");
		map.put(95555, "�й�����");
		System.out.println(map);
		
		// ����
		TreeMap<Integer, String> map0 = new TreeMap<Integer, String>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2-i1;
			}
		});
		
		map0.put(10010, "�й���ͨ");
		map0.put(10000, "�й�����");
		map0.put(10086, "�й��ƶ�");
		map0.put(95555, "�й�����");
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
