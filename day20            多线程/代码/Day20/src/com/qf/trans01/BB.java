package com.qf.trans01;

/**
 * 	���ѵ��߳�
 * @author Dushine2008
 *
 */
public class BB extends Thread {
	
	Card card;
	
	public BB(Card card) {
		super();
		this.card = card;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 12; i++) {
			// ȡ��
			card.setMoney(card.getMoney()-5000);
			System.out.println("����ȡ��5000,ʣ��" + card.getMoney());
		}
	}
}
