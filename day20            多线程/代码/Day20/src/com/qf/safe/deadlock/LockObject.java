package com.qf.safe.deadlock;

/**
 * 	两个对象锁
 * 	同时获取才能执行代码
 * @author Dushine2008
 *
 */
public class LockObject {
	public static Object lockA = new Object();
	public static Object lockB = new Object();
}
