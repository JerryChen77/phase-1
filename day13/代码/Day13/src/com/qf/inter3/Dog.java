package com.qf.inter3;

/**
 * ������
 */
public class Dog implements Jumpable, Swimable {

	@Override
	public void swim() {
		System.out.println("���������ͻ���Ӿ");
	}

	@Override
	public void jump() {
		System.out.println("�������Ĳ���̫��");
	}

}
