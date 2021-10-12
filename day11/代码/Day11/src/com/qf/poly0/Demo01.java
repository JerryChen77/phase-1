package com.qf.poly0;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 买车
		 * 	小客车
		 * 	巴士车
		 * 	摩托车
		 * 	拖拉机
		 * 	... ...
		 * 
		 * 汽车工厂生产汽车
		 * 	各种各样的汽车
		 * 	根据客户的需求生产汽车
		 * 
		 * 创建所有车子的父类--车子类
		 * 	车子类的子类
		 * 		小客车
		 * 		巴士车
		 * 		摩托车
		 * 		拖拉机
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("您需要什么类型的汽车("
				+ "		 * 1、小轿车\r\n" + 
				"		 * 2、巴士车\r\n" + 
				"		 * 3、拖拉机\r\n" + 
				"		 * 4、摩托车\r\n" + 
				"		 * 其他数字返回null):");
		int num = sc.nextInt();
		
		AutoFactory autoFactory = new AutoFactory();
		Auto auto = autoFactory.getAuto(num);
		
		auto.start();
		
	}
}



