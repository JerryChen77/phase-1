package com.qf.pack;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 *  Integer(int value) 
			          ����һ���·���� Integer ��������ʾָ���� int ֵ�� 
			Integer(String s) 
			          ����һ���·���� Integer ��������ʾ String ������ָʾ�� int ֵ�� 
		 */
		
		Integer i1 = new Integer(110);
		System.out.println(i1);
		System.out.println(i1.getClass());
		System.out.println(i1 == 110);
		
		Integer i2 = new Integer("220");
		System.out.println(i2);
		System.out.println(i2.getClass());
		System.out.println(i2 == 220);
		
		Integer i3 = 330;
		System.out.println(i3);
		System.out.println(i3.getClass());
		System.out.println(i3 == 330);
		
		int i4 = 330;
		System.out.println(i3 == i4);
		
		Integer i5 = new Integer(110);
		System.out.println(i1 == i5);
		
	}
}
