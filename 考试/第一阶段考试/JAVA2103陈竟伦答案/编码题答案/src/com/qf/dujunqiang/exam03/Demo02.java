package com.qf.dujunqiang.exam03;

import java.util.ArrayList;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * (二)	创建ArrayList集合，创建学生类
				a)	存入6个学生对象，有姓名、年龄、地址属性(2分)
				b)	筛选集合中张姓学生放入新的集合(3分)
		 */
		
		// 创建ArrayList集合，创建学生类
		ArrayList<Student> list = new ArrayList<Student>();
		
		// 存入6个学生对象，有姓名、年龄、地址属性
		addObj(list);
		System.out.println(list);
		
		ArrayList<Student> newList = filterStu(list);
		System.out.println(newList);
	}
	
	/**
	 * 
	 * @param list
	 */
	public static void addObj(ArrayList<Student> list) {
		list.add(new Student("张三", 28, "杭州"));
		list.add(new Student("李四", 23, "南京"));
		list.add(new Student("王五", 25, "上海"));
		list.add(new Student("赵柳", 26, "合肥"));
		list.add(new Student("张起", 21, "武汉"));
		list.add(new Student("张八", 29, "长沙"));
	}
	
	/**
	 * 筛选集合中张姓学生放入新的集合
	 * @param list
	 * @return
	 */
	public static ArrayList<Student> filterStu(ArrayList<Student> list){
		ArrayList<Student> newList = new ArrayList<Student>();
		
		for (Student stu : list) {
			if (stu.getName().startsWith("张")) {
				newList.add(stu);
			}
		}
		return newList;
	}
}

/**
 * 学生类，有姓名、年龄、地址属性
 * @author Dushine2008
 *
 */
class Student{
	private String name;
	private int age;
	private String addr;
	
	public Student() {
		super();
	}

	public Student(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
