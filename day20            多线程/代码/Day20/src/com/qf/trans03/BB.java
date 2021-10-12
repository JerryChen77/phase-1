package com.qf.trans03;

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
			card.take();
		}
	}
}
