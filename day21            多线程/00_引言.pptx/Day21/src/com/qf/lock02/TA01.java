package com.qf.lock02;

/**
 * 	修改数组的线程01
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
		arrSrc.lock.lock();
		try {
			arrSrc.arr[arrSrc.index] = "Hello";
			arrSrc.index++;
		} finally {
			arrSrc.lock.unlock();
		}
	}
}
