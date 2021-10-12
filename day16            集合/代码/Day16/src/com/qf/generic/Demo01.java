package com.qf.generic;

import java.util.ArrayList;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	·ºÐÍ
		 */

		ArrayList list01 = new ArrayList();
		list01.add(110);
		list01.add("Hello");
		list01.add(3.14);
		list01.add(true);
		list01.add(new Stu("zhangsan", 23));
		System.out.println(list01);
		
		ArrayList<String> list02 = new ArrayList<String>();
		list02.add("110");
		list02.add("Hello");
		list02.add("3.14");
		list02.add("true");
		list02.add(new Stu("zhangsan", 23).toString());

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

}
