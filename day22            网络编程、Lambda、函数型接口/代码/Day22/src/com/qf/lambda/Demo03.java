package com.qf.lambda;

public class Demo03 {
	public static void main(String[] args) {
		USB u1 = new USB() {
			@Override
			public void charge() {
				System.out.println("USB具有充电功能...");
			}
		};
		u1.charge();
		
		USB u2 = () -> System.out.println("USB接口真的能充电");
		u2.charge();
	}
}

@FunctionalInterface
interface USB{
	void charge();
	// void transfer();
}
