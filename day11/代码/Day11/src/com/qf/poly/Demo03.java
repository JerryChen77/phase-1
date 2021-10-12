package com.qf.poly;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * ������������
		 * 	�����Լ������Ժͷ���
		 */
		Worker w1 = new Worker();
		w1.work();
		System.out.println("type����:" + w1.type);	// ����
		System.out.println("=======================");
		
		/**
		 * ��̬�Ĵ�������ʽ
		 * 	���Ե��ø���ķ���
		 */
		Worker w2 = new ZongziWorker();
		w2.work();
		System.out.println("type����:" + w2.type);	// ���ӹ�
		System.out.println("=======================");
		
		/**
		 * ��̬�Ĵ�������ʽ
		 * 	���Ե��ø���ķ���
		 * 	--���������д�˼̳еķ��������е���������д֮��ķ���
		 * ���ܵ���������еķ���
		 */
		Worker w3 = new MooncakeWorker();
		w3.work();
		System.out.println("type����:" + w3.type);	// �±���
		
		// w3.eatMooncake();
	}
}

class Worker{
	String type = "����";
	
	public void work() {
		System.out.println("��������");
	}
}

class ZongziWorker extends Worker{
	String type = "���ӹ�";
	
}

class MooncakeWorker extends Worker{
	String type = "�±���";
	double salary = 6000;
	
	@Override
	public void work() {
		super.work();
		System.out.println("�±��������±�");
	}
	
	public void eatMooncake() {
		System.out.println("�±����˿���Ʒ���±�...");
	}
}
