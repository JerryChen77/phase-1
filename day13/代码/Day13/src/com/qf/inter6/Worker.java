package com.qf.inter6;

/**
 * ����Boss����Ĺ���
 * 	ֻҪ��ʵ����OnWorkFinishedListener�Ķ���ָ�ӹ���
 * @author Dushine2008
 *
 */
public class Worker {

	public void work(String info, OnWorkFinishedListener listener) {
		System.out.println("���յ�Boss���������:" + info);
		
		System.out.println();
		
		// �ѹ�����Ϣ����BOSS
		listener.workFinishListener("Ŭ������,��������:30%");
		
	}
	
}
