package com.qf.thread;

public class Demo02 {
	public static void main(String[] args) {
		// 创建线程实例
		MyThread mt = new MyThread();
		// 调用方法启动线程
		mt.start();
	}
}

/**
 * 	子类继承Thread，重写run方法
 * @author Dushine2008
 */
class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("子线程--------------------------------");
		}
	}
}
