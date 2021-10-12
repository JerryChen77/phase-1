package com.qf.sb;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	增
			 StringBuffer append(char c) 
			          将 char 参数的字符串表示形式追加到此序列。 
			 StringBuffer append(char[] str) 
			          将 char 数组参数的字符串表示形式追加到此序列。 

		 */
		
		StringBuffer buffer1 = new StringBuffer();
		buffer1.append(true);
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		
		buffer1.append(new char[] {'a','b','c'});
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());
		
		// 从指定位置插入数据
		buffer1.insert(0, false);
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());
		
		buffer1.append(true);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());
		
		System.out.println(buffer1.hashCode());
		
		buffer1.append("0");
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());
		
		System.out.println(buffer1.hashCode());
		
		/**
		buffer1.append(new Dog("道哥", 2));
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());
		 * 
		 */
		
	}
}

class Dog {
	String name;
	int age;

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

}
