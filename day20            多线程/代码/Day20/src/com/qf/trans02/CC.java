package com.qf.trans02;

/**
 * 	�������߳�
 * @author Dushine2008
 * 
 * 	������ͬ�������
 *
 */
public class CC extends Thread {
	Card card;
	
	public CC(Card card) {
		this.card = card;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 12; i++) {
			synchronized (card) {
				card.setMoney(card.getMoney()+5000);
				System.out.println("����������5000,ʣ��" + card.getMoney());
			}
		}
	}
}
