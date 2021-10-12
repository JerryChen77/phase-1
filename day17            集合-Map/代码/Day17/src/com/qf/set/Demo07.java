package com.qf.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo07 {
	public static void main(String[] args) {
		/**
		 * TreeSet(Comparator<? super E> comparator) 
			          构造一个新的空 TreeSet，它根据指定比较器进行排序。 
		 */
		// 创建TreeSet,传入比较器,自定义比较规则
		MyComparator mc = new MyComparator();
		TreeSet<Integer> set = new TreeSet<Integer>(mc);
		set.add(110);
		set.add(456);
		set.add(111);
		set.add(123);
		set.add(789);
		set.add(78);
		System.out.println(set);
		
		System.out.println("======================");
		
		HumanComparator hc = new HumanComparator();
		TreeSet<Human> mans = new TreeSet<Human>(hc);
		
		mans.add(new Human("zhangsan", 23));
		mans.add(new Human("lisisi", 25));
		mans.add(new Human("wangwu", 20));
		mans.add(new Human("zhaoliu", 20));
		
		System.out.println(mans);
	}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer i1, Integer i2) {
		return i2-i1;
	}
	
}

class Human{
	String name;
	int age;
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
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
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

/**
 * Human比较器
 * 	先按照年龄排序
 * 	如果年龄相同，比较姓名
 * @author Dushine2008
 *
 */
class HumanComparator implements Comparator<Human>{

	@Override
	public int compare(Human h1, Human h2) {
		int ret = h1.age - h2.age;
		if (ret == 0) {
			ret = h1.name.compareTo(h2.name);
		}
		return ret;
	}
	
}
