package com.qf.static0;

public class Demo03 {
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		User u4 = new User();
		User u5 = new User("","");
	}
}

class User{
	String name;
	String uid;
	static int count = 0;
	
	public User() {
		super();
		count++;
		System.out.println("当前注册用户数量:" + count);
	}

	public User(String name, String uid) {
		super();
		this.name = name;
		this.uid = uid;
		count++;
		System.out.println("当前注册用户数量:" + count);
	}
	
	public void show() {
		System.out.println("User [name=" + name + ", uid=" + uid + "]");
	}
	
}