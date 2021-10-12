package com.qf.arr;

/**
 * 	线程B,插入World
 * @author Dushine2008
 *
 */
public class TA02 extends Thread {
	
	ArrSrc arrSrc;
	
	public TA02(ArrSrc arrSrc) {
		super();
		this.arrSrc = arrSrc;
	}		
	
	@Override
	public void run() {
		// 向数数组中插入World
		arrSrc.addStr("World");
	}
}
