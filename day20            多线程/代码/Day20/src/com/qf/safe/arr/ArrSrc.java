package com.qf.safe.arr;

import java.util.Arrays;

/**
 * 	������Դ��
 * @author Dushine2008
 *
 */
public class ArrSrc {
	private String[] arr = new String[5];
	private int index = 0;
	
	/**
	 * 	�޸�����ķ���
	 * 	ͬ���ķ�������������̰߳�ȫ����
	 * @param str
	 */
	public synchronized void addStr(String str) {
		// A���÷���--�޸�0λλHello
		arr[index] = str;
		// �߳�B����ִ�У��޸�0λWorld
		index++;
	}

	@Override
	public String toString() {
		return "ArrSrc [arr=" + Arrays.toString(arr) + ", index=" + index + "]";
	}
	
}
