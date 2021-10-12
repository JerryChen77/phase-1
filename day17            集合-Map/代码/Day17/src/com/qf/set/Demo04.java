package com.qf.set;

import java.util.HashSet;

public class Demo04 {
	public static void main(String[] args) {
		HashSet<Stu> stus = new HashSet<Stu>();
		stus.add(new Stu("张三", 23));
		stus.add(new Stu("李四", 23));
		stus.add(new Stu("王五", 23));
		stus.add(new Stu("赵柳", 23));
		stus.add(new Stu("赵柳", 23));
		System.out.println(stus);
	}
}

class Stu {
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

	@Override
	public int hashCode() {
		System.out.println(name + "调用了HashCode方法");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(name + "调用了equals方法");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stu other = (Stu) obj;
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
