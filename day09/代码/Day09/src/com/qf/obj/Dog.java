package com.qf.obj;

/**
 * 	����
 * 		����
 * 			Dog
 * 		����
 * 			Ʒ��
 * 			ëɫ
 * 			�Ա�
 * 			����
 *
 *		��Ϊ
 *			�Է�
 *			˯��
 *			����
 */
public class Dog {
	// ����--����
	String type;
	String color;
	String gender;
	int age;
	
	// ����--����
	public void eat(String food) {
		System.out.println("����ϲ����:" + food);
	}
	
	public void sleep(String time) {
		System.out.println("����˯����ʱ����:" + time);
	}
	
	public void lookHome() {
		System.out.println("���ӿ��Կ��һ�Ժ");
	}
}
