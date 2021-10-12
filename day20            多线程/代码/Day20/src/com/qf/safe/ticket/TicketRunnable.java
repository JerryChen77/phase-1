package com.qf.safe.ticket;

/**
 * 	��Ʊ��Runnableʵ����
 * @author Dushine2008
 *
 */
public class TicketRunnable implements Runnable {
	int ticket = 100;
	@Override
	public void run() {
		while (true) {
			// ��ԭ�Ӳ�������ͬ�������
			synchronized (Object.class) {
				if (ticket <= 0) {
					break;
				}
				
				ticket--;
				System.out.println(Thread.currentThread().getName() + "�����˵�" + (100-ticket) + "��Ʊ,��ʣ��" + ticket);
			}
		}
	}
}
