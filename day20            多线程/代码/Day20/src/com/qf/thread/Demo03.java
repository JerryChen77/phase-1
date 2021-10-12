package com.qf.thread;

public class Demo03 {
	public static void main(String[] args) {
		PrimeRun p = new PrimeRun();
		Thread t = new Thread(p);
		
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main输出++++++" + i);
		}
		
	}
}

class PrimeRun implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
			System.out.println("线程000输出Hello--" + i);
		}
    }
}