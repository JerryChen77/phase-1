package com.qf.dujunqiang.exam02;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * (三)	(5分)编写代码实现工厂模式，能生产摩托车、拖拉机、大巴车
				以上内容在同一个Java文件中实现
		 */
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您需要的车子的代号(1==Bus   2==MOTOBicycle  3==Tractor  其他数字提示不存在):");
		int type = sc.nextInt();
		
		Car car = CarFactory.getCar(type);
		if (car != null) {
			car.run();
		} else {
			System.out.println("您输入的类型暂不存在...");
		}
	}
}

/**
 * 	所有车子的父类
 * 		汽车工厂返回Car类型的子类
 * @author Dushine2008
 *
 */
interface Car {
	void run();
}

/**
 * 	摩托车类
 * 		用户输出此类名返回一个Moto的对象
 * @author Dushine2008
 *
 */
class MotoBicycle implements Car{
	@Override
	public void run() {
		System.out.println("摩托车在复杂地形可以发挥很大的作用....");
	}
}

/**
 * 	拖拉机类
 * 		用户输出此类名返回一个Tractor的对象
 * @author Dushine2008
 *
 */
class Tractor implements Car{
	@Override
	public void run() {
		System.out.println("拖拉机主要用于生产环境.....");
	}
}

/**
 * Car的实现类
 * 	表示公交车,用户输入公交车或者其代号的时候返回这个类的对象
 * @author Dushine2008
 *
 */
class Bus implements Car {
	@Override
	public void run() {
		System.out.println("Bus主要功能是载人");
	}
}

/**
 * 	车子工厂
 * 		接收用户的参数
 * 		返回参数指向的对象
 * @author Dushine2008
 *
 */
class CarFactory {
	public static Car getCar(int type) {
		// 1==Bus   2==MOTOBicycle  3==Tractor  其他数字报异常
		Car car = null;
		
		// 根据用户传入的参数返回对应的车子
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
			System.err.println("车型不存在...");
			break;
		}
		
		return car;
	}
}