package com.qf.modify;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	private���ε����Կɼ���
		 * 		ֻ�б����п��Է���
		 * 	defaule��������
		 * 		�����п��Է���
		 * 		ͬһ�����п��Է���
		 * 		��ͬ�����ʲ���
		 * 	protected--�ܱ�����
		 * 		�����п��Է���
		 * 		ͬһ�����п��Է���
		 * 		��ͬ��������Է���
		 * 	public
		 * 		�����п��Է���
		 * 		ͬһ�����п��Է���
		 * 		��ͬ��������Է���
		 * 		����λ�ÿ��Է���
		 */
		
		DD dd = new DD();
		System.out.println(dd.ddDefault);
		System.out.println(dd.ddprotected);
		System.out.println(dd.ddPublic);
	}
}

