package com.qf.trans02;

/**
 * 	���ѵ��߳�
 * @author Dushine2008
 * 
 * 	����������ӿ���ȡ������
 * 	������ͬ�������
 *
 */
public class BB extends Thread {
	Card card;
	
	public BB(Card card) {
		this.card = card;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 12; i++) {
			synchronized (card) {
				if (card.getMoney() > 0) {
					card.setMoney(card.getMoney()-5000);
					System.out.println("����ȡ����5000,ʣ��" + card.getMoney());
				} else {
					System.out.println("����...");
					i--;
				}
			}
		}
	}
}
