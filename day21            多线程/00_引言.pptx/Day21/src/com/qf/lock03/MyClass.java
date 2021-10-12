package com.qf.lock03;

import java.util.concurrent.locks.ReentrantLock;

public class MyClass{
	private String value;
	// 创建锁对象
	ReentrantLock lock = new ReentrantLock();

	/**
	 * 	读取数据
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
	 * 	设置value的值
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