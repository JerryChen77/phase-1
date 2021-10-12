package com.qf.dujunqiang.exam04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/**
		 * (一)	(5分)模拟用户登录功能实现。
				接收用户输入的用户名和密码，创建User对象
				获取文件中存储的用户名、密码匹配：
				匹配成功提示用户登录成功
				匹配失败则提示用户登录失败（文件名和内容如下）
		 */
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// 接收用户输入的用户名和密码
		System.out.println("请输入用户名:");
		String uName = sc.next();
		
		System.out.println("请输入密码:");
		String uPwd = sc.next();
		// 根据输入的数据创建User对象
		User user = new User(uName, uPwd);
		
		// 获取配置文件中的数据持久User对象
		Properties properties = new Properties();
		properties.load(new FileInputStream(new File("users.properties")));
		
		User defaultUser = new User(properties.getProperty("username"), properties.getProperty("password"));
		
		// 两个user对象equals比较是否相等
		if (user.equals(defaultUser)) {
			System.out.println("登录成功!");
		} else {
			System.out.println("用户名或者密码错误...");
		}
	}
}

/**
 * User类
 * @author Dushine2008
 *
 */
class User{
	private String username;
	private String password;
	
	public User() {
		super();
	}

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}
