package com.qf.func;

public class Demo05 {
	public static void main(String[] args) {
		notice();
		login(123321, 110033);
	}
	
	public static void notice() {
		System.out.println("����թƭ...");
	}
	
	/**
	 *	��¼�ķ��������봫���û���������--�����������գ����밴�չ涨������������д
	 * @param username	�û���
	 * @param password	����
	 */
	public static void login(int username,int password) {
		// ��֤����
		if ((username == 123321) && (password == 112233)) {
			System.out.println("��¼�ɹ�");
		}else {
			System.out.println("�������");
		}
	}
}
