package com.qf.safe.deadlock;

/**
 * 	�����߳�
 * @author Dushine2008
 *
 */
public class BB01 extends Thread {
	@Override
	public void run() {
		synchronized (LockObject.lockA) {
			System.out.println("�����õ��˿���A,���ڳ��Ի�ȡ����B...");
			synchronized (LockObject.lockB) {
				System.out.println("������ȡ���˿���A��B,���Կ�����������");
			}
		}
	}
}
