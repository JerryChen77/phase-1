package com.qf.lock;

/**
 * 	�޸�������߳�02
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
		arrSrc.addStr("World");
	}
}
