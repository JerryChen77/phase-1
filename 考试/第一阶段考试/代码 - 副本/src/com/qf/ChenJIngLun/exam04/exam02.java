package com.qf.ChenJIngLun.exam04;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class exam02 {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		ArraysSum1 a1 = new ArraysSum1(0);
		ArraysSum1 a2 = new ArraysSum1(1);
		Future<Integer> f1 = es.submit(a1);
		Future<Integer> f2 = es.submit(a2);
		es.shutdown();
		try {
			Integer sum = f1.get()+f2.get();
			System.out.println("×ÜºÍÎª£º"+sum);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
	}
	class ArraysSum1 implements Callable<Integer>{
		int arr [][] = {{1,2},{1,2}};              
		Integer sum = 0;
		int index;
		public ArraysSum1(int index) {
			super();
			this.index = index;
		}
		@Override
		public Integer call() throws Exception {
			for (int i = 0; i < arr[index].length; i++) {
				sum += arr[index][i];
			}
			return sum;
		}
		
	}
