package com.qf.thread;

public class Demo03 {
	public static void main(String[] args) {
		PrimeRun p = new PrimeRun();
		Thread t = new Thread(p);
		
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main���++++++" + i);
		}
		
	}
}

class PrimeRun implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
			System.out.println("�߳�000���Hello--" + i);
		}
    }
}