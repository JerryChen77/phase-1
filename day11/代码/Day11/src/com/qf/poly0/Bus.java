package com.qf.poly0;

/**
 * ��ʿ��
 */
public class Bus extends Auto {
	@Override
	public void start() {
		System.out.println("��ʿ����������¿���ʹ����������");
	}
	
	@Override
	public void stop() {
		System.out.println("��������ɲ�����ܷǳ���Ҫ,ʹ�ù�ɲ");
	}
	
	@Override
	public void func() {
		System.out.println("���������ڳ���ͨ��");
	}
}
