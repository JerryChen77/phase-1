package com.qf.inter;

public class Demo01 {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		// 接口中的变量是静态的
		System.out.println(USB.Voltage);
		mouse.power();
		// final修饰的变量
		// USB.Voltage = "5.0V";
	}
}
