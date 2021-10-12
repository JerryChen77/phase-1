package com.qf.trans03;

/**
 * 	卡
 * 	BB线程和CC线程共同操作
 * @author Dushine2008
 *
 */
public class Card {
	private int money = 0;
	// 卡里是否有钱的标记
	private boolean flag = false;
	
	/**
	 * 	存款的方法
	 */
	public synchronized void take() {
		// 判断flag是否能取
		if (flag == false) {
			try {
				this.wait();
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// flag是true,可以取
		this.money -= 5000;
		System.out.println("冰冰取出了5000,剩余" + this.money);
		flag = false;
		this.notify();
		
	}
	
	/**
	 * 	存款的方法
	 */
	public synchronized void save() {
		// 判断flag，决定能不能存
		if (flag == true) {
			try {
				this.wait();
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// flag==false，可以存
		this.money += 5000;
		System.out.println("晨晨存入了5000,剩余" + this.money);
		flag = true;
		this.notify();
	}
	
}
