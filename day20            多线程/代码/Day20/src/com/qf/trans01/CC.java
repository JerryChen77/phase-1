package com.qf.trans01;

/**
 * 	�������߳�
 * @author Dushine2008
 *
 */
public class CC extends Thread {
	
	Card card;
	
	public CC(Card card) {
		super();
		this.card = card;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 12; i++) {
			// ȡ��
			card.setMoney(card.getMoney()+5000);
			System.out.println("��������5000,ʣ��" + card.getMoney());
		}
	}
}
