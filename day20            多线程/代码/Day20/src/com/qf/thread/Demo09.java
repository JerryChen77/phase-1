package com.qf.thread;

public class Demo09 {
	public static void main(String[] args) {
		/**
		 *  int getPriority() 
		          	返回线程的优先级。 
		 	void setPriority(int newPriority) 
		          	更改线程的优先级。 
		 */
		
		MyThread004 t = new MyThread004();
		t.setPriority(10);
		t.setName("1号线程");
		t.start();
		
		MyThread004 t1 = new MyThread004();
		t1.setPriority(1);
		t1.setName("2号线程");
		t1.start();
		
	}
}

class MyThread004 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "输出：" + i);
		}
	}
	
}
