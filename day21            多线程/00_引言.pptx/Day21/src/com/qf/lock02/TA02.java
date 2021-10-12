package com.qf.lock02;

/**
 * 	修改数组的线程02
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
		arrSrc.lock.lock();
		try {
			arrSrc.arr[arrSrc.index] = "World";
			arrSrc.index++;
		} finally {
			arrSrc.lock.unlock();
		}
	}
}
