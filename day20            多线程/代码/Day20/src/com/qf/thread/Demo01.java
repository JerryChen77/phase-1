package com.qf.thread;

public class Demo01 {
	public static void main(String[] args) {
		PrimeThread p = new PrimeThread();
		p.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main线程输出HaHa============" + i);
		}
		
	}
}

class PrimeThread extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("子线程输出HelloWorld" + i);
		}
	}
}
