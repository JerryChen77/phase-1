package com.qf.inter5;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * Boss�������������
		 * 	��������ķ���
		 * 		giveWork(��������,��������Ķ���)
		 * 	���������--�������˹�������
		 * 		workFinishedListener(String info)
		 * 
		 * Worker��������
		 * 	�����
		 * 	�ɻ�ķ���--work
		 * 	�������֮�����Boss����������--����Boss�����ķ���������
		 */
		
		Worker worker = new Worker();
		
		Boss boss = new Boss(worker);
		
		boss.giveWork("�ڿ����Լ�");
		
	}
}

