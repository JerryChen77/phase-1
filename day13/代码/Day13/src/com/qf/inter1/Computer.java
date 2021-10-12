package com.qf.inter1;

public class Computer implements USB,HDMI,SD,RJ45 {

	@Override
	public void surfInternet() {
		System.out.println("我喜欢看小说、葫芦娃");
	}

	@Override
	public void SDreadData() {
		System.out.println("能读取SD卡中的数据");
	}

	@Override
	public void SDwriteData() {
		System.out.println("可以向SD卡写入数据");
	}

	@Override
	public void transferAVSignal() {
		System.out.println("可以传输视频信号");
	}

	@Override
	public void usbPower() {
		System.out.println("可以通过USB接口向外供电");
	}

}
