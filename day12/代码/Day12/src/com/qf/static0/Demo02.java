package com.qf.static0;

public class Demo02 {
	public static void main(String[] args) {
		Korean k1 = new Korean();
		k1.name = "��һ��";
		k1.age = 45;
		k1.show();
		
		System.out.println("=====================");
		
		Korean k2 = new Korean();
		k2.name = "�Ӱ�ǧ";
		k2.age = 25;
		k2.show();
		
		System.out.println("====================");
		
		// �޸ĳ�Ա����--ֻ�Ե�ǰ������Ӱ��
		k1.name = "�Ӱ���";
		k1.show();
		
		k2.show();
		System.out.println("====================");
		
		// �޸������--���д�����󶼻��ܵ�Ӱ��
		Korean.capital = "�׶�";
		k2.show();
		k1.show();
	}
}

class Korean{
	/**
	 * ʵ������
	 * 	ʵ������
	 */
	String name;
	int age;
	/**
	 * ��̬����
	 * 	�����
	 */
	static String capital = "����";
	
	public void show() {
		System.out.println("Korean [name=" + name + ", age=" + age + ", capital=" + capital + "]");
	}
	
}
