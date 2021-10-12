package com.qf.lock03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	编写类，创建对象
		 * 	在类中定义set和get方法
		 * 	分别使用ReentrantLock和ReentrantReadWriteLock，PK他们的效率
		 */
		// 开始的时间
		long startTime = System.currentTimeMillis();
		
		MyClass mc = new MyClass();
		
		// 创建线程池
		ExecutorService es = Executors.newFixedThreadPool(20);
		
		// 提交任务18条读取的任务和2条设置的任务
		for (int i = 0; i < 2; i++) {
			es.submit(new Runnable() {
				@Override
				public void run() {
					mc.setValue(Math.random() + "===");
				}
			});
		}
		
		for (int i = 0; i < 18; i++) {
			es.submit(new Runnable() {
				@Override
				public void run() {
					mc.getValue();
				}
			});
		}
		
		// 启动
		es.shutdown();
		
		// 统计总时间,最后执行此行代码
		
		// 如果线程没有完全结束,此处阻塞
		while (!es.isTerminated()) {}
		
		System.out.println(System.currentTimeMillis() - startTime);
		
	}
}
