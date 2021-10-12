package com.qf.dujunqiang.exam03;

import java.util.ArrayList;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * (��)	����ArrayList���ϣ�����ѧ����
				a)	����6��ѧ�����������������䡢��ַ����(2��)
				b)	ɸѡ����������ѧ�������µļ���(3��)
		 */
		
		// ����ArrayList���ϣ�����ѧ����
		ArrayList<Student> list = new ArrayList<Student>();
		
		// ����6��ѧ�����������������䡢��ַ����
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
		list.add(new Student("����", 28, "����"));
		list.add(new Student("����", 23, "�Ͼ�"));
		list.add(new Student("����", 25, "�Ϻ�"));
		list.add(new Student("����", 26, "�Ϸ�"));
		list.add(new Student("����", 21, "�人"));
		list.add(new Student("�Ű�", 29, "��ɳ"));
	}
	
	/**
	 * ɸѡ����������ѧ�������µļ���
	 * @param list
	 * @return
	 */
	public static ArrayList<Student> filterStu(ArrayList<Student> list){
		ArrayList<Student> newList = new ArrayList<Student>();
		
		for (Student stu : list) {
			if (stu.getName().startsWith("��")) {
				newList.add(stu);
			}
		}
		return newList;
	}
}

/**
 * ѧ���࣬�����������䡢��ַ����
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
