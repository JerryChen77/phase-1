package com.qf.lock;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 	������Դ��
 * @author Dushine2008
 *
 */
public class ArrSrc {
	private String[] arr = new String[5];
	private int index = 0;
	
	// ����ReentrantLock����
	ReentrantLock lock = new ReentrantLock();
	
	/**
	 * 	�޸��������ݵķ���
	 * @param str
	 */
	public void addStr(String str) {
		// �޸�֮ǰ����
		lock.lock();
		try {
			arr[index] = str;
			index++;
		} finally {
			// �����ȡ�����������
			lock.unlock();
		}
	}
	
	@Override
	public String toString() {
		return "ArrSrc [arr=" + Arrays.toString(arr) + ", index=" + index + "]";
	}
	
}
