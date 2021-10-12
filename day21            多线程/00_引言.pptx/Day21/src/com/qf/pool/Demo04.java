package com.qf.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo04 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// �����������
		MyCallable mc = new MyCallable();
		
		// �����̳߳�
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		// ��ȡFuture����,����������ȡ�Ľ��
		Future<Integer> f1 = es.submit(mc);
		
		// ����˳��ر�
		es.shutdown();
		
		// ��ȡ���
		Integer sum = f1.get();
		System.out.println(sum);
		
	}
}

/**
 * 	����Callable��ʵ����
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