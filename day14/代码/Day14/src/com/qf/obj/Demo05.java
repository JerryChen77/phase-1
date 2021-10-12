package com.qf.obj;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * equals方法
		 * 	判断对象是否相等
		 */
		Cat cat01 = new Cat("加菲", 2);
		System.out.println(cat01);

		Cat cat02 = new Cat("Tom", 2);
		System.out.println(cat02);

		Cat cat03 = new Cat("加菲", 2);
		System.out.println(cat03);

		System.out.println(cat01 == cat03);
		System.out.println(cat01.equals(cat03));
	}
}

class Cat {
	String name;
	int age;

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

}
