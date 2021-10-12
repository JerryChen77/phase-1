package com.qf.dujunqiang.exam02;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * (��)	(5��)��д����ʵ�ֹ���ģʽ��������Ħ�г�������������ͳ�
				����������ͬһ��Java�ļ���ʵ��
		 */
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("����������Ҫ�ĳ��ӵĴ���(1==Bus   2==MOTOBicycle  3==Tractor  ����������ʾ������):");
		int type = sc.nextInt();
		
		Car car = CarFactory.getCar(type);
		if (car != null) {
			car.run();
		} else {
			System.out.println("������������ݲ�����...");
		}
	}
}

/**
 * 	���г��ӵĸ���
 * 		������������Car���͵�����
 * @author Dushine2008
 *
 */
interface Car {
	void run();
}

/**
 * 	Ħ�г���
 * 		�û��������������һ��Moto�Ķ���
 * @author Dushine2008
 *
 */
class MotoBicycle implements Car{
	@Override
	public void run() {
		System.out.println("Ħ�г��ڸ��ӵ��ο��Է��Ӻܴ������....");
	}
}

/**
 * 	��������
 * 		�û��������������һ��Tractor�Ķ���
 * @author Dushine2008
 *
 */
class Tractor implements Car{
	@Override
	public void run() {
		System.out.println("��������Ҫ������������.....");
	}
}

/**
 * Car��ʵ����
 * 	��ʾ������,�û����빫������������ŵ�ʱ�򷵻������Ķ���
 * @author Dushine2008
 *
 */
class Bus implements Car {
	@Override
	public void run() {
		System.out.println("Bus��Ҫ����������");
	}
}

/**
 * 	���ӹ���
 * 		�����û��Ĳ���
 * 		���ز���ָ��Ķ���
 * @author Dushine2008
 *
 */
class CarFactory {
	public static Car getCar(int type) {
		// 1==Bus   2==MOTOBicycle  3==Tractor  �������ֱ��쳣
		Car car = null;
		
		// �����û�����Ĳ������ض�Ӧ�ĳ���
		switch (type) {
		case 1:
			car = new Bus();
			break;
			
		case 2:
			car = new MotoBicycle();
			break;
			
		case 3:
			car = new Tractor();
			break;
		default:
			System.err.println("���Ͳ�����...");
			break;
		}
		
		return car;
	}
}