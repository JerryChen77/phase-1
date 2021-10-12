package com.qf.poly0;

/**
 * 所有汽车的父类--不应被直接创建对象
 *	提供方法
 *		start
 *		run
 *		func
 */
public abstract class Auto {
	/*
		public void func() {
			System.out.println("车子能提供我们的效率");
		}
		
		public void start() {
			System.out.println("车子必须能启动");
		}
		
		public void stop() {
			System.out.println("车子必须能停车");
		}
	*/
	
	public abstract void func();
	
	public abstract void start();
	
	public abstract void stop();
}
