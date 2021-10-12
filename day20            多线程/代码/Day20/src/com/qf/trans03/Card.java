package com.qf.trans03;

/**
 * 	��
 * 	BB�̺߳�CC�̹߳�ͬ����
 * @author Dushine2008
 *
 */
public class Card {
	private int money = 0;
	// �����Ƿ���Ǯ�ı��
	private boolean flag = false;
	
	/**
	 * 	���ķ���
	 */
	public synchronized void take() {
		// �ж�flag�Ƿ���ȡ
		if (flag == false) {
			try {
				this.wait();
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// flag��true,����ȡ
		this.money -= 5000;
		System.out.println("����ȡ����5000,ʣ��" + this.money);
		flag = false;
		this.notify();
		
	}
	
	/**
	 * 	���ķ���
	 */
	public synchronized void save() {
		// �ж�flag�������ܲ��ܴ�
		if (flag == true) {
			try {
				this.wait();
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// flag==false�����Դ�
		this.money += 5000;
		System.out.println("����������5000,ʣ��" + this.money);
		flag = true;
		this.notify();
	}
	
}
