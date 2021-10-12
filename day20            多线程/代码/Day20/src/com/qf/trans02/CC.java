package com.qf.trans02;

/**
 * 	生产的线程
 * @author Dushine2008
 * 
 * 	加入了同步代码块
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
				System.out.println("晨晨存入了5000,剩余" + card.getMoney());
			}
		}
	}
}
