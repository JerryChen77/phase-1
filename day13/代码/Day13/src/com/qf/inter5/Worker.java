package com.qf.inter5;

public class Worker {

	public void work(String info, Boss boss) {
		System.out.println("���յ�Boss���������:" + info);
		
		System.out.println();
		
		// �ѹ�����Ϣ����BOSS
		boss.workFinishListener("Ŭ������,��������:30%");
		
	}
	
}
