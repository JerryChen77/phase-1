package com.qf.poly0;

/**
 * С������
 */
public class Car extends Auto {
	@Override
	public void start() {
		System.out.println("С����ʹ�õ�����");
	}
	
	@Override
	public void stop() {
		System.out.println("С����ʹ��ɲ����");
	}
	
	@Override
	public void func() {
		System.out.println("С������Ҫ�Ǽ���,��ˡ����°�...");
	}
}
