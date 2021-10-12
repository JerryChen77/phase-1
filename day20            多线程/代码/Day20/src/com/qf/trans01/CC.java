package com.qf.trans01;

/**
 * 	生产的线程
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
			// 取出
			card.setMoney(card.getMoney()+5000);
			System.out.println("晨晨存入5000,剩余" + card.getMoney());
		}
	}
}
