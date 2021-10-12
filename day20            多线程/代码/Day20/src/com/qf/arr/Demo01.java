package com.qf.arr;

public class Demo01 {
	public static void main(String[] args) {
		ArrSrc arrSrc = new ArrSrc();
		
		// �����߳�A��B
		TA01 ta01 = new TA01(arrSrc);
		TA02 ta02 = new TA02(arrSrc);
		
		ta01.start();
		ta02.start();
		
		// ��֤ta01��ta02�����������
		try {
			ta01.join();
			ta02.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(arrSrc);
	}
}
