package com.qf.func;

public class Demo06 {
	public static void main(String[] args) {
		getDouble(55);
		
		getSum(33, 55);
		
		show("����", 23);
		
		// ���������ʱ��ע�������˳��
		show("lisisi", 24);
	}
	
	/**
	 * 	��ȡ���ֵ�ƽ��
	 * @param a
	 */
	public static void getDouble(int a) {
		System.out.println("a��ƽ����:"+a*a);
	}
	
	/**
	 * 	����������ӵĽ��
	 * @param a
	 * @param b
	 */
	public static void getSum(int a,int b) {
		System.out.println("a��b�ĺ���:" + (a+b));
	}
	
	public static void show(String name,int age) {
		System.out.println("����:" + name + ",����:" + age);
	}
	
}
