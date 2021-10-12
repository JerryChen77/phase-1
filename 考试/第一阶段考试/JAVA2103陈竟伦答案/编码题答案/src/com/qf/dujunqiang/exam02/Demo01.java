package com.qf.dujunqiang.exam02;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * (һ)	(5��)��дһ��Person������
				Ҫ����������name�����䣨age������˽�����ԣ�
				�гԷ���eat�� ��˯����sleep���������󷽷���
				д���вκ��޲ι��췽����
				
				����ѧ����student���͹��ˣ�worker�� �����࣬�̳�Person�࣬
				ѧ��������˽������ѧ�ź�ѧϰ����������Ұ�ѧϰ����
				����������˽�����Թ��ź͹�������������Ұ���������
				
				���������д���ѧ���͹������ʵ������ʹ�ù��췽����ֵ��������������Ժͷ���
				����������ͬһ��Java�ļ���ʵ��
		 */
		
		Student stu = new Student("����", 23, "10010");
		System.out.println(stu);
		stu.eat();
		stu.sleep();
		stu.study();
		
		System.out.println("=================");
		
		Worker worker = new Worker("����", 24, "10011");
		System.out.println(worker);
		worker.eat();
		worker.sleep();
		worker.work();
	}
}

/**
 * Person������
 * 	Ҫ����������name�����䣨age������˽������
 * 	�гԷ���eat�� ��˯����sleep���������󷽷�
 * 	д���вκ��޲ι��췽��
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
 * ����ѧ����Student���࣬�̳�Person��
 * ѧ��������˽������ѧ�ź�ѧϰ����������Ұ�ѧϰ��
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
		System.out.println("����ѧУʳ�óԷ�...");
	}

	@Override
	public void sleep() {
		System.out.println("����ѧУ����˯��...");
	}
	
	public void study() {
		System.out.println("�Ұ�ѧϰ");
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
}

/**
 * �������ˣ�Worker���࣬�̳�Person��
 * ����������˽�����Թ��ź͹�������������Ұ�������
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
		System.out.println("���ڹ���ʳ�óԷ�...");
	}

	@Override
	public void sleep() {
		System.out.println("���ڹ�������˯��...");
	}
	
	public void work() {
		System.out.println("�Ұ�����");
	}

	@Override
	public String toString() {
		return "Worker [wId=" + wId + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
}
