package com.qf.exam;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 2、编写图形工具类，包含以下方法：
			a. 传入三角形的三条边，计算三角形的周长
			b. 传入三角形的三条边，计算三角形的面积
		 */
		
		// 创建对象并调用方法--2分
		ShapeUtil shapeUtil = new ShapeUtil();
		
		double per = shapeUtil.getPer(3, 4, 5);
		System.out.println(per);
		
		double area = shapeUtil.getArea(3, 4, 5);
		System.out.println(area);
		
	}
}

class ShapeUtil{
	
	/**
	 * 计算三角形周长--4分
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public double getPer(double a,double b,double c) {
		// 判断能不能构成三角形
		if ((a+b>c) && (a+c>b) && (b+c>a)) {
			return a+b+c;
		}else {
			System.out.println("无法构成三角形");
			return -1;
		}
	}
	
	/**
	 * 计算三角形面积--4分
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public double getArea(double a,double b,double c) {
		// 判断能不能构成三角形
		if ((a+b>c) && (a+c>b) && (b+c>a)) {
			// 计算半周长
			double p = (a+b+c)/2;
			double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			return area;
		}else {
			System.out.println("无法构成三角形");
			return -1;
		}
	}
	
}
