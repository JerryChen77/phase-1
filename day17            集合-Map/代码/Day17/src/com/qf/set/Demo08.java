package com.qf.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo08 {
	public static void main(String[] args) {
		// 创建TreeSet对象,传入匿名内部类对象
		TreeSet<Worker> workers = new TreeSet<Worker>(new Comparator<Worker>() {
			@Override
			public int compare(Worker w1, Worker w2) {
				int ret = w1.age - w2.age;
				return w1.age - w2.age==0 ? w1.name.compareTo(w2.name) : ret;
			}
		});
		
		workers.add(new Worker("zhangsan", 23));
		workers.add(new Worker("lisisi", 25));
		workers.add(new Worker("wangwu", 20));
		workers.add(new Worker("zhaoliu", 20));
		
		System.out.println(workers);
	}
}

/**
 * 	工人类
 */
class Worker {
	String name;
	int age;

	public Worker(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + "]";
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
		Worker other = (Worker) obj;
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
