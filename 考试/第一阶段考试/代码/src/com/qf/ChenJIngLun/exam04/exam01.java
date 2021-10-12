package com.qf.ChenJIngLun.exam04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(new File("C:\\Users\\ALIENWARE\\Desktop\\qf\\JAVA 2103\\周考代码\\第一阶段考试\\代码\\src\\users.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username1 = sc.next();
		System.out.println("请输入密码");
		String password1 = sc.next();
		
		User a = new User(username1, password1);
		
		if(p.get("uesrname").equals(a.getUsername())&&p.get("password").equals(a.getPassword())) {
			System.out.println("登陆成功");
		}else {
			System.out.println("登录失败");
		}
		
	}

}
class User{
	String username;
	String password;
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
