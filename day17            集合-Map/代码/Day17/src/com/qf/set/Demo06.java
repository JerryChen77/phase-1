package com.qf.set;

import java.util.TreeSet;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	元素不重复	-- set
		 * 	元素能排序	-- list
		 * 
		 * TreeSet能搞定
		 * 
		 *  TreeSet() 
			          构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。 
			TreeSet(Collection<? extends E> c) 
			          构造一个包含指定 collection 元素的新 TreeSet，它按照其元素的自然顺序进行排序。 
		 */
		
		// 排序
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(110);
		set.add(456);
		set.add(111);
		set.add(123);
		set.add(789);
		set.add(78);
		System.out.println(set);
		
		// 排序和不可重复
		TreeSet<String> set0 = new TreeSet<String>();
		set0.add("Tom");
		set0.add("Tony");
		set0.add("Jerry");
		set0.add("Lucy");
		set0.add("Lily");
		set0.add("Lily");
		set0.add("Lily");
		set0.add("Lily");
		System.out.println(set0);
		
		TreeSet<Student> stus = new TreeSet<Student>();
		System.out.println(stus);
		
		stus.add(new Student("zhangsan", 23));
		stus.add(new Student("lisisi", 25));
		stus.add(new Student("wangwu", 20));
		stus.add(new Student("zhaoliu", 20));
		System.out.println(stus);
		
	}
}

/**
 * 	实现了Comparable接口的类
 * 	按照学生的年龄排序
 *
 */
class Student implements Comparable<Student>{
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * 	按照年龄排序
	 * 	如果年龄相同再比较姓名
	 */
	@Override
	public int compareTo(Student s) {
		int ret = this.age - s.age;
		
		if (ret == 0) {
			ret = this.name.compareTo(s.name);
		}
		return ret;
	}
	
}
