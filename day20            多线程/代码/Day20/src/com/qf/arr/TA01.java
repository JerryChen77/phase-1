package com.qf.arr;

/**
 * 	线程A,插入Hello
 * @author Dushine2008
 *
 */
public class TA01 extends Thread {
	
	ArrSrc arrSrc;
	
	public TA01(ArrSrc arrSrc) {
		super();
		this.arrSrc = arrSrc;
	}		
	
	@Override
	public void run() {
		// 向数数组中插入Hello
		arrSrc.addStr("Hello");
	}
}
