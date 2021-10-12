package com.qf.safe.deadlock;

/**
 * 	晨晨线程
 * @author Dushine2008
 */
public class CC01 extends Thread {
	@Override
	public void run() {
		synchronized (LockObject.lockB) {
			System.out.println("晨晨拿到了筷子B,正在尝试获取筷子A...");
			synchronized (LockObject.lockA) {
				System.out.println("晨晨获取到了筷子A和B,可以开动啦啦啦啦");
			}
		}
	}
}
