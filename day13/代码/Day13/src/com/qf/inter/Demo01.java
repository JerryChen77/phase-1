package com.qf.inter;

public class Demo01 {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		// �ӿ��еı����Ǿ�̬��
		System.out.println(USB.Voltage);
		mouse.power();
		// final���εı���
		// USB.Voltage = "5.0V";
	}
}
