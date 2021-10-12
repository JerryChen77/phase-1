package com.qf.inter3;

/**
 * 狗子类
 */
public class Dog implements Jumpable, Swimable {

	@Override
	public void swim() {
		System.out.println("狗子天生就会游泳");
	}

	@Override
	public void jump() {
		System.out.println("狗子跳的不是太高");
	}

}
