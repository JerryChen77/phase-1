package com.qf.inter5;

public class Worker {

	public void work(String info, Boss boss) {
		System.out.println("接收到Boss分配的任务:" + info);
		
		System.out.println();
		
		// 把工作信息告诉BOSS
		boss.workFinishListener("努力工作,工作进度:30%");
		
	}
	
}
