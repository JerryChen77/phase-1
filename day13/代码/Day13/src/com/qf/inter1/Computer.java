package com.qf.inter1;

public class Computer implements USB,HDMI,SD,RJ45 {

	@Override
	public void surfInternet() {
		System.out.println("��ϲ����С˵����«��");
	}

	@Override
	public void SDreadData() {
		System.out.println("�ܶ�ȡSD���е�����");
	}

	@Override
	public void SDwriteData() {
		System.out.println("������SD��д������");
	}

	@Override
	public void transferAVSignal() {
		System.out.println("���Դ�����Ƶ�ź�");
	}

	@Override
	public void usbPower() {
		System.out.println("����ͨ��USB�ӿ����⹩��");
	}

}
