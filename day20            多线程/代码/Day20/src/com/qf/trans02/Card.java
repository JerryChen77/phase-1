package com.qf.trans02;

/**
 * 	卡
 * 	BB线程和CC线程共同操作
 * @author Dushine2008
 *
 */
public class Card {
	private int money = 0;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Card [money=" + money + "]";
	}
	
}
