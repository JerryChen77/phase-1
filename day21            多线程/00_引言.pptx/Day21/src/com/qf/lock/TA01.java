package com.qf.lock;

/**
 * 	�޸�������߳�01
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
		arrSrc.addStr("Hello");
	}
}
