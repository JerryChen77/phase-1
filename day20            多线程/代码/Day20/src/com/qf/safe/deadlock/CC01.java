package com.qf.safe.deadlock;

/**
 * 	�����߳�
 * @author Dushine2008
 */
public class CC01 extends Thread {
	@Override
	public void run() {
		synchronized (LockObject.lockB) {
			System.out.println("�����õ��˿���B,���ڳ��Ի�ȡ����A...");
			synchronized (LockObject.lockA) {
				System.out.println("������ȡ���˿���A��B,���Կ�����������");
			}
		}
	}
}
