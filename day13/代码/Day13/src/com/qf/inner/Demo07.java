package com.qf.inner;

public class Demo07 {
	public static void main(String[] args) {
		new USB() {
			public void usbPower() {
				System.out.println("USB�����������");
			}
		}.usbPower();
	}
}
