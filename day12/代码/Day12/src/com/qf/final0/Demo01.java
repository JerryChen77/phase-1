package com.qf.final0;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * ����
		 * 	����ֵ����
		 * 		1,2,3,a,b,c
		 * 
		 * 	�Զ��峣��
		 * 		�Լ����ݳ�����Ҫ����Ĳ��ɸı������
		 * 		Բ���ʦ�
		 */
		final String birthday = "1990-12-30";
		System.out.println("birthday = " + birthday);
		
		// final���εı���ֻ�ܸ�ֵһ��
		// birthday = "1995-12-31";
		
		People p = new People();
		System.out.println(p.country);
		System.out.println(p.name);
		System.out.println(p.age);
		
		
	}
}

class People{
	// final���εĳ�Ա�������븳ֵ
	
	// ������ͬʱֱ�Ӹ�ֵ
	final String country;
	String name = "����";
	int age;
	static String capital;
	
	{
		// �ڹ��������и�ֵ
		// country = "�л����񹲺͹�";
	}
	
	public People() {
		super();
		// �����ڹ������и�ֵ--���й��������붼�и�ֵ�Ĳ���
		this.country = "�л����񹲺͹�";
	}

	public People(String country, String name, int age) {
		super();
		this.country = country;
		this.name = name;
		this.age = age;
	}
	
}

