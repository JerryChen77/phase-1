package com.qf.trans03;

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
			card.take();
		}
	}
}
