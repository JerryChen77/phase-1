package com.qf.poly0;

/**
 * ��������
 */
public class Tractor extends Auto {
	@Override
	public void start() {
		System.out.println("�й��ĵ��ܲ��ͻ�ʹ��ҡ������");
	}
	
	@Override
	public void stop() {
		System.out.println("����������ʱ�����ײ��ͣ��");
	}
	
	@Override
	public void func() {
		System.out.println("�������������������ˡ����硢��ˮ������");
	}
}
