package com.qf.obj;

public class Demo01 {
	public static void main(String[] args) {
		// ��������
		Dog dog = new Dog();
		// ����dog����ķ���
		dog.eat("��ͷ����");
		
		String type = dog.type;
		System.out.println(type);
		
		dog.type = "�л���԰Ȯ";
		System.out.println(dog.type);
	}
}
