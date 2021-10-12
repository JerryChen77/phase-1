package com.qf.inter6;

/**
 * 接收Boss任务的工人
 * 	只要是实现了OnWorkFinishedListener的都能指挥工人
 * @author Dushine2008
 *
 */
public class Worker {

	public void work(String info, OnWorkFinishedListener listener) {
		System.out.println("接收到Boss分配的任务:" + info);
		
		System.out.println();
		
		// 把工作信息告诉BOSS
		listener.workFinishListener("努力工作,工作进度:30%");
		
	}
	
}
