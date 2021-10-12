package com.qf.lock04;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class MyClass{
	private String value;
	ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	// ��ȡ������д��
	ReadLock readLock = readWriteLock.readLock();
	WriteLock writeLock = readWriteLock.writeLock();

	/**
	 * 	��ȡ����
	 * @return
	 */
	public String getValue() {
		readLock.lock();
		try {
			Thread.sleep(1000);
			return value;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			readLock.unlock();
		}
		return value;
	}

	/**
	 * 	����value��ֵ
	 * @param value
	 */
	public void setValue(String value) {
		writeLock.lock();
		try {
			Thread.sleep(1000);
			this.value = value;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			writeLock.unlock();
		}
	}

	@Override
	public String toString() {
		return "MyClass [value=" + value + "]";
	}
	
}