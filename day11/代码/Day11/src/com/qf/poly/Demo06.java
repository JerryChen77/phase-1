package com.qf.poly;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * ����ת��
		 * 	����С��===�����ʹ��
		 * 	��ȫ
		 * 	ֻ�ܵ��ø���ķ���
		 * 	��̬�ĺ��ĸ���
		 */
		Person p = new Man();
		p.dance();
		
		/**
		 * ����ת��
		 * 	ת��С������
		 * 	�з���
		 * 	���ת�ص��Ǳ��������--���Ե����Լ������Ժͷ���
		 * 
		 * 	���ת���ɴ˸���������������ͻᱨ��ClassCastException:
		 * 
		 * 	����ת��֮ǰ����ʹ��instanceof�ؼ��ּ��
		 * 		������Ϊtrue�����ת
		 * 		���򲻿���ת
		 */
		
		Man man = (Man) p;
		man.fight();
		
		// Woman woman = (Woman)p;
		
		System.out.println(p instanceof Woman);
		System.out.println(p instanceof Man);
		
	}
}


class Person{
	String name = "��";
	int age = 22;
	
	public void dance() {
		System.out.println("�˿��ĵ�ʱ��������㵸...");
	}
	
}

class Man extends Person{
	@Override
	public void dance() {
		super.dance();
		System.out.println("����ϲ������˹��");
	}
	
	public void fight() {
		System.out.println("���ԱȽϺö�");
	}
}

class Woman extends Person{
	@Override
	public void dance() {
		super.dance();
		System.out.println("Ů��ϲ�����㳡��");
	}
}
