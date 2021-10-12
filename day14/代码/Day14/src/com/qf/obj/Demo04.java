package com.qf.obj;

public class Demo04 {
	public static void main(String[] args) {
		// hashCode--获取对象的哈希码值
		Dog dog01 = new Dog();
		int code01 = dog01.hashCode();
		System.out.println(code01);
		
		Dog dog02 = new Dog();
		int code02 = dog02.hashCode();
		System.out.println(code02);
		
	}
}

class Dog {
	String name;
	int age;

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
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
		Dog other = (Dog) obj;
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
		return "Dog [name=" + name + ", age=" + age + "]";
	}

}
