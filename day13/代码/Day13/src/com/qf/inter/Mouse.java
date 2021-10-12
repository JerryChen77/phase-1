package com.qf.inter;

public class Mouse implements USB {

	@Override
	public void power() {
		System.out.println("USB接口具有供电的功能");
	}

}
