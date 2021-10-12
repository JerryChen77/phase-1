package com.qf.modify;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	private修饰的属性可见性
		 * 		只有本类中可以访问
		 * 	defaule修饰属性
		 * 		本类中可以访问
		 * 		同一个包中可以访问
		 * 		不同包访问不到
		 * 	protected--受保护的
		 * 		本类中可以访问
		 * 		同一个包中可以访问
		 * 		不同包子类可以访问
		 * 	public
		 * 		本类中可以访问
		 * 		同一个包中可以访问
		 * 		不同包子类可以访问
		 * 		其他位置可以访问
		 */
		
		DD dd = new DD();
		System.out.println(dd.ddDefault);
		System.out.println(dd.ddprotected);
		System.out.println(dd.ddPublic);
	}
}

