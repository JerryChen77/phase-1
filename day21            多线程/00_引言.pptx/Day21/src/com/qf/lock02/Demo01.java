package com.qf.lock02;

public class Demo01 {
	public static void main(String[] args) {
		ArrSrc arrSrc = new ArrSrc();
		// �����߳�
		TA01 t01 = new TA01(arrSrc);
		TA02 t02 = new TA02(arrSrc);
		
		// �����߳�
		t01.start();
		t02.start();
		
		// ��֤�޸�������߳��Ƚ���
		try {
			t01.join();
			t02.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// ����޸�֮�������
		System.out.println(arrSrc);
	}
}
