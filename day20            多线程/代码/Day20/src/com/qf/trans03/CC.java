package com.qf.trans03;

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
			card.save();
		}
	}
}
