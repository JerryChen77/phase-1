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
		 * (һ)	(5��)ģ���û���¼����ʵ�֡�
				�����û�������û��������룬����User����
				��ȡ�ļ��д洢���û���������ƥ�䣺
				ƥ��ɹ���ʾ�û���¼�ɹ�
				ƥ��ʧ������ʾ�û���¼ʧ�ܣ��ļ������������£�
		 */
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// �����û�������û���������
		System.out.println("�������û���:");
		String uName = sc.next();
		
		System.out.println("����������:");
		String uPwd = sc.next();
		// ������������ݴ���User����
		User user = new User(uName, uPwd);
		
		// ��ȡ�����ļ��е����ݳ־�User����
		Properties properties = new Properties();
		properties.load(new FileInputStream(new File("users.properties")));
		
		User defaultUser = new User(properties.getProperty("username"), properties.getProperty("password"));
		
		// ����user����equals�Ƚ��Ƿ����
		if (user.equals(defaultUser)) {
			System.out.println("��¼�ɹ�!");
		} else {
			System.out.println("�û��������������...");
		}
	}
}

/**
 * User��
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
