package com.qf.lock03;

import java.util.concurrent.locks.ReentrantLock;

public class MyClass{
	private String value;
	// ����������
	ReentrantLock lock = new ReentrantLock();

	/**
	 * 	��ȡ����
	 * @return
	 */
	public String getValue() {
		lock.lock();
		try {
			Thread.sleep(1000);
			return value;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return value;
	}

	/**
	 * 	����value��ֵ
	 * @param value
	 */
	public void setValue(String value) {
		lock.lock();
		try {
			Thread.sleep(1000);
			this.value = value;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	@Override
	public String toString() {
		return "MyClass [value=" + value + "]";
	}
	
}