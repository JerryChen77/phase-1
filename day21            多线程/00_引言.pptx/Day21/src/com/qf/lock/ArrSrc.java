package com.qf.lock;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 	数组资源类
 * @author Dushine2008
 *
 */
public class ArrSrc {
	private String[] arr = new String[5];
	private int index = 0;
	
	// 创建ReentrantLock对象
	ReentrantLock lock = new ReentrantLock();
	
	/**
	 * 	修改数组内容的方法
	 * @param str
	 */
	public void addStr(String str) {
		// 修改之前上锁
		lock.lock();
		try {
			arr[index] = str;
			index++;
		} finally {
			// 如果获取了锁必须解锁
			lock.unlock();
		}
	}
	
	@Override
	public String toString() {
		return "ArrSrc [arr=" + Arrays.toString(arr) + ", index=" + index + "]";
	}
	
}
