package com.qf.inner;

public class Demo06 {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.usbPower();
	}
}

class Mouse implements USB{

	@Override
	public void usbPower() {
		System.out.println("³äµç...");
	}
	
}