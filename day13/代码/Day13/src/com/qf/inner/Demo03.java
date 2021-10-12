package com.qf.inner;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 *	 创建成员内部类对象的方式
		 * 		先创建外部类对象
		 * 		在创建内部类对象
		 */
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		System.out.println(inner.strInner);
		inner.show();
		
	}
}

class Outer{
	String strOut = "外部类变量";
	private String strOutPri = "外部类私有变量";
	static String strOutSta = "外部类静态变量";
	int num = 110;
	
	class Inner{
		String strInner = "内部类变量";
		private String strInnerPri = "内部类私有变量";
		// 成员内部类不能声明静态数据
		// static String strInnerSta = "内部类静态变量";
		int num = 220;
		
		public void show() {
			// 内部类可以访问外部类的所有属性和方法
			System.out.println(strInner);
			System.out.println(strOut);
			System.out.println(strInnerPri);
			System.out.println(strOutPri);
			System.out.println(strOutSta);
			// 调用外部类的成员变量
			System.out.println(Outer.this.num);
		}
	}
	
}
