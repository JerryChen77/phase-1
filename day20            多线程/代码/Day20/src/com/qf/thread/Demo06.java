package com.qf.thread;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 *  static Thread currentThread() 
          			返回对当前正在执行的线程对象的引用。 
			void setName(String name) 
		          	改变线程名称，使之与参数 name 相同。 
		    String getName() 
		          	返回该线程的名称。 
            long getId() 
		          	返回该线程的标识符。 
		 */
		
		MyThread001 mt = new MyThread001();
		// 设置线程名字--最好在线程启动之前设置
		mt.setName("1号线程");
		mt.start();
		
		MyThread001 mt2 = new MyThread001();
		mt2.setName("22号线程");
		mt2.start();
		
		MyThread001 mt3 = new MyThread001();
		mt3.setName("333号线程");
		mt3.start();
		
	}
	
}

class MyThread001 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			// System.out.println(this.getName() + "正在输出:" + i);
			// System.out.println(Thread.currentThread().getName() + "正在输出:" + i);
			System.out.println(Thread.currentThread().getId() + "正在输出:" + i);
		}
	}
}
