package com.qf.demos;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	各种工程师
			父类
				ITProgrammer
			子类
				JavaProgrammer
				UiProgrammer
				DBAProgrammer
			每种工程师都有自己的工作内容（至少两个方法）
		
			在主类中添加show方法，传入ITProgrammer的子类对象，根据不同的子类调用他们的方法展示工作信息
		 */
		
		show(new JavaProgrammer());
		
		System.out.println("============");
		
		show(new UiProgrammer());
		
		System.out.println("+=================+");
		
		show(new DBAProgrammer());
		
	}
	
	/**
	 * 展示ITProgrammer子类的方法
	 * @param programmer
	 */
	public static void show(ITProgrammer programmer) {
		if (programmer instanceof JavaProgrammer) {
			programmer.coding();
			programmer.dress();
			((JavaProgrammer) programmer).liveAlone();
		} else if (programmer instanceof UiProgrammer) {
			programmer.coding();
			programmer.dress();
			((UiProgrammer) programmer).shopping();
		} else if (programmer instanceof DBAProgrammer) {
			programmer.coding();
			programmer.dress();
			((DBAProgrammer) programmer).putIntoPrison();
		} else {
			System.err.println("传入的类型不存在...");
		}
	}
}
