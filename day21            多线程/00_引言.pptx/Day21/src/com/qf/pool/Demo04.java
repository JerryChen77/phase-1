package com.qf.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo04 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 创建任务对象
		MyCallable mc = new MyCallable();
		
		// 创建线程池
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		// 获取Future对象,包含即将获取的结果
		Future<Integer> f1 = es.submit(mc);
		
		// 启动顺序关闭
		es.shutdown();
		
		// 获取结果
		Integer sum = f1.get();
		System.out.println(sum);
		
	}
}

/**
 * 	定义Callable的实现类
 * @author Dushine2008
 *
 */
class MyCallable implements Callable<Integer>{

	Integer sum = 0;
	@Override
	public Integer call() throws Exception {
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
}