package com.qf.inter5;

public class Boss {
	Worker worker;

	public Boss(Worker worker) {
		super();
		this.worker = worker;
	}

	/**
	 * �����˷��乤��
	 * @param info
	 */
	public void giveWork(String info) {
		worker.work(info, this);
	}

	public void workFinishListener(String info) {
		System.out.println("���յ����˴�������Ϣ:" + info);
	}
}
