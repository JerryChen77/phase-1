package com.qf.thread;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 *  static Thread currentThread() 
          			���ضԵ�ǰ����ִ�е��̶߳�������á� 
			void setName(String name) 
		          	�ı��߳����ƣ�ʹ֮����� name ��ͬ�� 
		    String getName() 
		          	���ظ��̵߳����ơ� 
            long getId() 
		          	���ظ��̵߳ı�ʶ���� 
		 */
		
		MyThread001 mt = new MyThread001();
		// �����߳�����--������߳�����֮ǰ����
		mt.setName("1���߳�");
		mt.start();
		
		MyThread001 mt2 = new MyThread001();
		mt2.setName("22���߳�");
		mt2.start();
		
		MyThread001 mt3 = new MyThread001();
		mt3.setName("333���߳�");
		mt3.start();
		
	}
	
}

class MyThread001 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			// System.out.println(this.getName() + "�������:" + i);
			// System.out.println(Thread.currentThread().getName() + "�������:" + i);
			System.out.println(Thread.currentThread().getId() + "�������:" + i);
		}
	}
}
