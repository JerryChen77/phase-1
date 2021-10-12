package com.qf.dujunqiang.exam02;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * (一)	(5分)编写一个Person抽象类
				要求含有姓名（name）年龄（age）两个私有属性，
				有吃饭（eat） 和睡觉（sleep）两个抽象方法，
				写出有参和无参构造方法，
				
				创建学生（student）和工人（worker） 两个类，继承Person类，
				学生类多出了私有属性学号和学习方法（输出我爱学习），
				工人类多出了私有属性工号和工作方法（输出我爱工作），
				
				在主函数中创建学生和工人类的实例对象，使用构造方法赋值，并输出所有属性和方法
				以上内容在同一个Java文件中实现
		 */
		
		Student stu = new Student("张三", 23, "10010");
		System.out.println(stu);
		stu.eat();
		stu.sleep();
		stu.study();
		
		System.out.println("=================");
		
		Worker worker = new Worker("李四", 24, "10011");
		System.out.println(worker);
		worker.eat();
		worker.sleep();
		worker.work();
	}
}

/**
 * Person抽象类
 * 	要求含有姓名（name）年龄（age）两个私有属性
 * 	有吃饭（eat） 和睡觉（sleep）两个抽象方法
 * 	写出有参和无参构造方法
 * @author Dushine2008
 */
abstract class Person{
	private String name;
	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public abstract void eat();
	
	public abstract void sleep();
	
}

/**
 * 创建学生（Student）类，继承Person类
 * 学生类多出了私有属性学号和学习方法（输出我爱学习）
 * */

/**
 * @author Dushine2008
 *
 */
class Student extends Person{
	private String sId;
	
	public Student() {
		super();
	}

	public Student(String sId) {
		super();
		this.sId = sId;
	}

	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name, int age, String sId) {
		super(name, age);
		this.sId = sId;
	}
	
	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	@Override
	public void eat() {
		System.out.println("我在学校食堂吃饭...");
	}

	@Override
	public void sleep() {
		System.out.println("我在学校宿舍睡觉...");
	}
	
	public void study() {
		System.out.println("我爱学习");
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
}

/**
 * 创建工人（Worker）类，继承Person类
 * 工人类多出了私有属性工号和工作方法（输出我爱工作）
 * */

class Worker extends Person{
	private String wId;
	
	public Worker() {
		super();
	}

	public Worker(String wId) {
		super();
		this.wId = wId;
	}

	public Worker(String name, int age) {
		super(name, age);
	}
	
	public Worker(String name, int age, String wId) {
		super(name, age);
		this.wId = wId;
	}
	
	public String getwId() {
		return wId;
	}

	public void setwId(String wId) {
		this.wId = wId;
	}

	@Override
	public void eat() {
		System.out.println("我在工地食堂吃饭...");
	}

	@Override
	public void sleep() {
		System.out.println("我在工地宿舍睡觉...");
	}
	
	public void work() {
		System.out.println("我爱工作");
	}

	@Override
	public String toString() {
		return "Worker [wId=" + wId + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
}
