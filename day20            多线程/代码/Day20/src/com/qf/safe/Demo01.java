package com.qf.safe;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	��Ʊ����
		 * 	��վ4��������Ʊ
		 * 		1��ÿ����������100��Ʊ
		 * 		2���ĸ����ڹ�ͬ����100��Ʊ
		 */
		
		TicketThread t1 = new TicketThread();
		TicketThread t2 = new TicketThread();
		TicketThread t3 = new TicketThread();
		TicketThread t4 = new TicketThread();
		
		t1.setName("1�Ŵ���");
		t2.setName("2�Ŵ���");
		t3.setName("3�Ŵ���");
		t4.setName("4�Ŵ���");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}

class TicketThread extends Thread{
	static int ticket = 100;
	@Override
	public void run() {
		while (true) {
			// ���û��Ʊ,��ֹѭ��
			if (ticket <= 0) {
				break;
			}
			
			ticket--;
			System.out.println(Thread.currentThread().getName() + "�����˵�" + (100-ticket) + "��Ʊ,��ʣ��" + ticket);
		}
	}
}
