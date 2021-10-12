package com.qf.inter6;

public class Boss3 implements OnWorkFinishedListener {
	Worker worker;

	public Boss3(Worker worker) {
		super();
		this.worker = worker;
	}

	/**
	 * 给工人分配工作
	 * @param info
	 */
	public void giveWork(String info) {
		worker.work(info, this);
	}

	public void workFinishListener(String info) {
		System.out.println("接收到工人传来的信息:" + info);
	}
}
