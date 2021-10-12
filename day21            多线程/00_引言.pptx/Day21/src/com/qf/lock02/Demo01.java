package com.qf.lock02;

public class Demo01 {
	public static void main(String[] args) {
		ArrSrc arrSrc = new ArrSrc();
		// 创建线程
		TA01 t01 = new TA01(arrSrc);
		TA02 t02 = new TA02(arrSrc);
		
		// 启动线程
		t01.start();
		t02.start();
		
		// 保证修改数组的线程先结束
		try {
			t01.join();
			t02.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 输出修改之后的数组
		System.out.println(arrSrc);
	}
}
