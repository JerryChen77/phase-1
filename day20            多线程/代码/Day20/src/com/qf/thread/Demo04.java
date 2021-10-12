package com.qf.thread;

public class Demo04 {
	public static void main(String[] args) {
		// 创建实现类实例
		MyRunnable mr = new MyRunnable();
		// 创建Thread实例，把实现类实例当做构造器的参数传入
		Thread t = new Thread(mr);
		// 调用start方法启动线程
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main线程输出World=============" + i);
		}
	}
}

/**
 * 	创建类实现Runnable
 * 	重写run方法
 * @author Dushine2008
 *
 */
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("子线程执行Hello" + i);
		}
	}
	
}
