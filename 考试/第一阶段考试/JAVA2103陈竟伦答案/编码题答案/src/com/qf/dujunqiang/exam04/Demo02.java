package com.qf.dujunqiang.exam04;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo02 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/**
		 * (二)	(5分)请初始化一个长度为5的二维数组
				a)	创建线程池对象
				b)	多线程计算总和,要求每条线程计算一个一维数组
		 */
		int[][] arr = new int[5][];
		arr[0] = new int[]{1,2,3,4,5};
		arr[1] = new int[]{6,7,8,9,10};
		arr[2] = new int[]{11,12,13,14,15};
		arr[3] = new int[]{16,17,18,19,20};
		arr[4] = new int[]{21,22,23,24,25};
		
		// 创建线程池对象
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		Future<Integer> f01 = es.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 0; i < arr[0].length; i++) {
					sum += arr[0][i];
				}
				return sum;
			}
		});
		
		Future<Integer> f02 = es.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 0; i < arr[1].length; i++) {
					sum += arr[1][i];
				}
				return sum;
			}
		});
		
		Future<Integer> f03 = es.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 0; i < arr[2].length; i++) {
					sum += arr[2][i];
				}
				return sum;
			}
		});
		
		Future<Integer> f04 = es.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 0; i < arr[3].length; i++) {
					sum += arr[3][i];
				}
				return sum;
			}
		});
		
		Future<Integer> f05 = es.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 0; i < arr[4].length; i++) {
					sum += arr[4][i];
				}
				return sum;
			}
		});
		
		es.shutdown();
		
		System.out.println(f01.get() + f02.get() + f03.get() + f04.get() + f05.get());
	}
}
