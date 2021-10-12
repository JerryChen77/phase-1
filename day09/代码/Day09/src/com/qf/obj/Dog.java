package com.qf.obj;

/**
 * 	狗类
 * 		类名
 * 			Dog
 * 		属性
 * 			品种
 * 			毛色
 * 			性别
 * 			年龄
 *
 *		行为
 *			吃饭
 *			睡觉
 *			看家
 */
public class Dog {
	// 属性--变量
	String type;
	String color;
	String gender;
	int age;
	
	// 属性--方法
	public void eat(String food) {
		System.out.println("狗子喜欢吃:" + food);
	}
	
	public void sleep(String time) {
		System.out.println("狗子睡觉的时间是:" + time);
	}
	
	public void lookHome() {
		System.out.println("狗子可以看家护院");
	}
}
