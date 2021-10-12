package com.qf.func;

public class Demo05 {
	public static void main(String[] args) {
		notice();
		login(123321, 110033);
	}
	
	public static void notice() {
		System.out.println("谨防诈骗...");
	}
	
	/**
	 *	登录的方法，必须传入用户名和密码--填空题的两个空，必须按照规定的数据类型填写
	 * @param username	用户名
	 * @param password	密码
	 */
	public static void login(int username,int password) {
		// 验证密码
		if ((username == 123321) && (password == 112233)) {
			System.out.println("登录成功");
		}else {
			System.out.println("密码错误");
		}
	}
}
