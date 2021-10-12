package com.qf.thread;

public class Demo05 {
	public static void main(String[] args) {
		System.out.println("集全村之力造火箭...");
		
		System.out.println("火箭造好啦...拉到发射场...");
		
		System.out.println("准备倒计时...");
		
		for (int i = 10; i >= 0; i--) {
			System.out.println("倒计时:" + i);
			try {
				// 线程休眠
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("发射...");
	}
}
