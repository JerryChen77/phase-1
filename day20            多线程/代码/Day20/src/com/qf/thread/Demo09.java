package com.qf.thread;

public class Demo09 {
	public static void main(String[] args) {
		/**
		 *  int getPriority() 
		          	�����̵߳����ȼ��� 
		 	void setPriority(int newPriority) 
		          	�����̵߳����ȼ��� 
		 */
		
		MyThread004 t = new MyThread004();
		t.setPriority(10);
		t.setName("1���߳�");
		t.start();
		
		MyThread004 t1 = new MyThread004();
		t1.setPriority(1);
		t1.setName("2���߳�");
		t1.start();
		
	}
}

class MyThread004 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "�����" + i);
		}
	}
	
}
