package com.qf.trans01;

/**
 * 	消费的线程
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
			// 取出
			card.setMoney(card.getMoney()-5000);
			System.out.println("冰冰取出5000,剩余" + card.getMoney());
		}
	}
}
