package com.qf.inner;

public class Demo04 {
	public static void main(String[] args) {
		// 静态内部类对象的创建不再依赖外部类对象
		System.out.println(Outer00.Inner00.strInnerSta);
		
		Outer00.Inner00 inner00 = new Outer00.Inner00();
		
	}
}


class Outer00{
	String strOut = "外部类变量";
	private String strOutPri = "外部类私有变量";
	static String strOutSta = "外部类静态变量";
	int num = 110;
	
	static class Inner00{
		String strInner = "内部类变量";
		private String strInnerPri = "内部类私有变量";
		// 静态内部类能声明静态数据
		static String strInnerSta = "内部类静态变量";
		int num = 220;
		
		public void show() {
			// 静态内部类可以访问外部类静态属性和方法
			System.out.println(strInner);
			// 静态内部类只能访问外部类的静态数据
			// System.out.println(strOut);
			System.out.println(strInnerPri);
			// System.out.println(strOutPri);
			System.out.println(strOutSta);
			// 不能调用外部类的成员变量
			// System.out.println(Outer.this.num);
		}
	}
}