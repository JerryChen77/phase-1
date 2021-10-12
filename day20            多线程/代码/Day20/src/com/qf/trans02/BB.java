package com.qf.trans02;

/**
 * 	消费的线程
 * @author Dushine2008
 * 
 * 	解决了余额不足扔可以取的问题
 * 	加入了同步代码块
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
					System.out.println("冰冰取出了5000,剩余" + card.getMoney());
				} else {
					System.out.println("余额不足...");
					i--;
				}
			}
		}
	}
}
