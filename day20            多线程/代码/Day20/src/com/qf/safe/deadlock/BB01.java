package com.qf.safe.deadlock;

/**
 * 	冰冰线程
 * @author Dushine2008
 *
 */
public class BB01 extends Thread {
	@Override
	public void run() {
		synchronized (LockObject.lockA) {
			System.out.println("冰冰拿到了筷子A,正在尝试获取筷子B...");
			synchronized (LockObject.lockB) {
				System.out.println("冰冰获取到了筷子A和B,可以开动啦啦啦啦");
			}
		}
	}
}
