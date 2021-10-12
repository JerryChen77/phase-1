package com.qf.inter5;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * Boss分配任务：买包烟
		 * 	分配任务的方法
		 * 		giveWork(工作内容,分配任务的对象)
		 * 	任务给工人--监听工人工作进度
		 * 		workFinishedListener(String info)
		 * 
		 * Worker接收任务
		 * 	买包烟
		 * 	干活的方法--work
		 * 	买烟完成之后告诉Boss任务完成情况--调用Boss监听的方法告诉他
		 */
		
		Worker worker = new Worker();
		
		Boss boss = new Boss(worker);
		
		boss.giveWork("挖坑埋自己");
		
	}
}

