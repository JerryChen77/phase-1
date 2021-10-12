package com.qf.block;

public class Demo02 {
	public static void main(String[] args) {
		Restaurant r1 = new Restaurant();
		Restaurant r2 = new Restaurant();
		Restaurant r3 = new Restaurant();
		Restaurant r4 = new Restaurant();
		Restaurant r5 = new Restaurant();
	}
}

class Restaurant {
	String food01;
	String food02;
	String food03;
	String food04;
	String food05;
	String food06;
	// ¿ÍÁ÷Á¿
	static int count = 0;
	
	// ¹¹Ôì´úÂë¿é
	{
		// System.out.println("food01 = " + food01);
		System.out.println("ÎÒÊÇ£¨¹¹Ôì£©´úÂë¿é");
	}
	
	{
		System.out.println("food02 = " + food02);
		System.out.println("ÎÒÊÇ¶¯Ì¬´úÂë¿é");
	}

	public Restaurant() {
		super();
		System.out.println("»¶Ó­¹âÁÙºìÀËÂş!");
		count++;
	}

	public Restaurant(String food01) {
		super();
		this.food01 = food01;
		System.out.println("»¶Ó­¹âÁÙºìÀËÂş!");
		count++;
	}

	public Restaurant(String food01, String food02) {
		super();
		this.food01 = food01;
		this.food02 = food02;
		System.out.println("»¶Ó­¹âÁÙºìÀËÂş!");
		count++;
	}

	public Restaurant(String food01, String food02, String food03) {
		super();
		this.food01 = food01;
		this.food02 = food02;
		this.food03 = food03;
		System.out.println("»¶Ó­¹âÁÙºìÀËÂş!");
		count++;
	}

	public Restaurant(String food01, String food02, String food03, String food04) {
		super();
		this.food01 = food01;
		this.food02 = food02;
		this.food03 = food03;
		this.food04 = food04;
		System.out.println("»¶Ó­¹âÁÙºìÀËÂş!");
		count++;
	}

	public Restaurant(String food01, String food02, String food03, String food04, String food05) {
		super();
		this.food01 = food01;
		this.food02 = food02;
		this.food03 = food03;
		this.food04 = food04;
		this.food05 = food05;
		System.out.println("»¶Ó­¹âÁÙºìÀËÂş!");
		count++;
	}

	public Restaurant(String food01, String food02, String food03, String food04, String food05, String food06) {
		super();
		this.food01 = food01;
		this.food02 = food02;
		this.food03 = food03;
		this.food04 = food04;
		this.food05 = food05;
		this.food06 = food06;
		System.out.println("»¶Ó­¹âÁÙºìÀËÂş!");
		count++;
	}

	public void sayHi() {
		System.out.println("»¶Ó­¹âÁÙºìÀËÂş!");
	}
}
