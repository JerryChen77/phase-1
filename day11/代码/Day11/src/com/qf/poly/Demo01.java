package com.qf.poly;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * ���� С���� = �����ʵ��;
		 * 	С����.eat()====>  С��СϺ
		 * 	С����.sleep() ==> Ʈ��˯
		 */
		/**
		 * ��������ָ���������--��̬
		 * 	����󢵱�����￴��
		 */
		Animal animal;
		animal = new Salamander();
		animal.eat();
		
		/**
		 *  ����󢵱�������߿���
		 */
		Hunter hunter = new Salamander();
		hunter.hunt();
	}
}

class Animal extends Hunter{
	String type = "����";
	String name;
	int age;
	
	public void eat() {
		System.out.println("������Ҫ��ʳ");
	}
	
	public void sleep() {
		System.out.println("������Ҫ��Ϣ");
	}
}

class Salamander extends Animal{
	@Override
	public void eat() {
		System.out.println("�����ϲ����С��СϺ");
	}
	
	@Override
	public void sleep() {
		System.out.println("�����˯�������Ƶ�Ʈ��˯");
	}
	
	@Override
	public void hunt() {
		System.out.println("�����Բ�ʳһЩС�Ķ���");
	}
}

class Hunter{
	String type;
	
	public void hunt() {
		System.out.println("���ֿ��Բ�������");
	}
	
}
