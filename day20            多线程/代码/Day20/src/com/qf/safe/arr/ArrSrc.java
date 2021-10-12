package com.qf.safe.arr;

import java.util.Arrays;

/**
 * 	数组资源类
 * @author Dushine2008
 *
 */
public class ArrSrc {
	private String[] arr = new String[5];
	private int index = 0;
	
	/**
	 * 	修改数组的方法
	 * 	同步的方法，不会出现线程安全问题
	 * @param str
	 */
	public synchronized void addStr(String str) {
		// A调用方法--修改0位位Hello
		arr[index] = str;
		// 线程B插入执行，修改0位World
		index++;
	}

	@Override
	public String toString() {
		return "ArrSrc [arr=" + Arrays.toString(arr) + ", index=" + index + "]";
	}
	
}
