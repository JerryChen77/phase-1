package com.qf.pri;

public class Demo02 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "����";
		s1.setAge(255);
		// s1.age = 2555;
		s1.show();
	}
	
}

/**
 * 	˽�л���Ա����
 * 	�ṩ�����ķ���
 * 	�ڷ��������ù���
 * 		get
 * 			��ȡ	
 * 		set
 * 			����
 */
class Student{
	String name;
	// ˽�л�����,ֻ���ڱ�����ʹ��
	private int age;
	
	public void show() {
		System.out.println("����" + name + ",����" + getAge());
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// �ж�age�Ƿ�Ϸ�
		if (age > 0 && age < 135) {
			this.age = age;
		} else {
			this.age = -1;
			System.err.println("���䲻�Ϸ�");
		}
	}
}
