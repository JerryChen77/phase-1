package com.qf.arr;

/**
 * 	�߳�A,����Hello
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
		// ���������в���Hello
		arrSrc.addStr("Hello");
	}
}
