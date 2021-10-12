package com.qf.abstract0;

public class Demo02 {
	public static void main(String[] args) {
		JavaITWorker worker = new JavaITWorker();
		worker.work();
	}
}

abstract class Worker{
	public abstract void work();
	
	public abstract void eat();
	
	public abstract int makeMoney();
}

abstract class ITWorker extends Worker{
	
}


class JavaITWorker extends ITWorker{
	@Override
	public void work() {
		System.out.println("我们每天Coding");
	}

	@Override
	public void eat() {
		
	}

	@Override
	public int makeMoney() {
		return 0;
	}
}
