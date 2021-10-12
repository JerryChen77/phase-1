package com.qf.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
	public static void main(String[] args) {
		// 创建线程池对象
		ExecutorService es = Executors.newFixedThreadPool(4);
		System.out.println(es);
		
		// 提交线程任务
		for (int i = 0; i < 20; i++) {
			es.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
				}
			});
		}
		System.out.println(es);
		// 启动顺序关闭
		es.shutdown();
		for (int i = 0; i < 10; i++) {
			System.out.println(es);
		}
		
	}
}
