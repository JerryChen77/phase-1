package com.qf.poly0;

/**
 * 汽车工厂
 * 	负责生产汽车
 */
public class AutoFactory {
	public Auto getAuto(int num) {
		/**
		 * 1、小轿车
		 * 2、巴士车
		 * 3、拖拉机
		 * 4、摩托车
		 * 其他数字返回null
		 */
		Auto auto = null;
		// 根据num返回对应类型的车子
		switch (num) {
		case 1:
			System.out.println("小汽车生产成功");
			auto = new Car();
			break;
		
		case 2:
			System.out.println("巴士车生产成功");
			auto = new Bus();
			break;
			
		case 3:
			System.out.println("拖拉机生产成功");
			auto = new Tractor();
			break;
			
		case 4:
			System.out.println("摩托车生产成功");
			auto = new MOTOBicycle();
			break;

		default:
			System.err.println("车子不存在");
			break;
		}
		
		return auto;
	}
}
