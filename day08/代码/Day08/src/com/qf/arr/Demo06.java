package com.qf.arr;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	���ҽ���
		 * 		����
		 * 		���֡�����
		 * 		���֡����䡢��ַ
		 * 		���֡�רҵ
		 * 		���֡���ע
		 * 
		 * 	���ҽ��ܵķ���
		 * 	show
		 * 
		 *	�����ͨ�������������������ַ���
		 *		��������������
		 *			����
		 *				�����б��Լ�֮ǰ��������
		 *			ʵ��
		 *				{}�е���������
		 *	
		 *	ͬһ�����г�����������ͬ�ķ��������ǵĲ����б�ͬ
		 *		��������
		 */
		
		show("����", 23);
		
		show("lisisi");
		
		
	}
	
	public static void show(String name) {
		System.out.println("����:" + name);
	}
	
	public static void show(String name,int age) {
		System.out.println("����:" + name + ",����:" + age);
	}
	
}
