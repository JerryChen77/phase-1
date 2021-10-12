package com.qf.arr;

public class Demo01 {
	public static void main(String[] args) {
		ArrSrc arrSrc = new ArrSrc();
		
		// 创建线程A和B
		TA01 ta01 = new TA01(arrSrc);
		TA02 ta02 = new TA02(arrSrc);
		
		ta01.start();
		ta02.start();
		
		// 保证ta01和ta02结束后再输出
		try {
			ta01.join();
			ta02.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(arrSrc);
	}
}
