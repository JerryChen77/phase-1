package com.qf.coll;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo06 {
	public static void main(String[] args) throws InterruptedException {
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(4);
		queue.add("zhangsan");
		queue.add("lisi");
		queue.add("wangwu");
		queue.add("zhaoliu");
		System.out.println(queue);
		
		// queue.add("zhaoliu");
		
		boolean b = queue.offer("tianqi");
		System.out.println(b);
		
		queue.put("liuba");
		
	}
}
