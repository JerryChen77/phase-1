package com.qf.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo05 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/**
		 * 	���������̼߳���1---10000�ۼӵĽ��
		 */
		
		// �����̳߳ض���
		ExecutorService es = Executors.newFixedThreadPool(4);
		
		// ��������
		GetSumCallable c1 = new GetSumCallable(0, 2500);
		GetSumCallable c2 = new GetSumCallable(2501, 5000);
		GetSumCallable c3 = new GetSumCallable(5001, 7500);
		GetSumCallable c4 = new GetSumCallable(7501, 10000);
		
		// �ύ����
		Future<Integer> f1 = es.submit(c1);
		Future<Integer> f2 = es.submit(c2);
		Future<Integer> f3 = es.submit(c3);
		Future<Integer> f4 = es.submit(c4);
		
		// ����˳��ر�
		es.shutdown();
		
		// ��ȡ���
		Integer sum = f1.get() + f2.get() + f3.get() + f4.get();
		
		System.out.println(sum);
	}
}

/**
 * 	����start�ۼӵ�end���������
 * @author Dushine2008
 *
 */
class GetSumCallable implements Callable<Integer>{
	private int start;
	private int end;
	int sum = 0;
	
	public GetSumCallable(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	@Override
	public Integer call() throws Exception {
		
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	
}
