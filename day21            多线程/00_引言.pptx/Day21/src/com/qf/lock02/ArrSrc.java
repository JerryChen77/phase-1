package com.qf.lock02;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 	������Դ��
 * @author Dushine2008
 *
 */
public class ArrSrc {
	String[] arr = new String[5];
	int index = 0;
	
	// ����ReentrantLock����
	ReentrantLock lock = new ReentrantLock();
	
	@Override
	public String toString() {
		return "ArrSrc [arr=" + Arrays.toString(arr) + ", index=" + index + "]";
	}
	
}
