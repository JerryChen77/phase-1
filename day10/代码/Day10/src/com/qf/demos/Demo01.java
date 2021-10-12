package com.qf.demos;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	编写学生类
				属性
					name
					age
					sex
					address
				方法
					run
					eat
					sleep
				
			新生入学,需要录入5个学生信息, 编写程序, 录入资料系统,把这写学生放入数组
				输出年龄是大于23岁的学生的名字
				输出地址在杭州的学生的所有信息
		 */
		
		int[] arr = {11,22,33};
		String[] arrr = {"","",""};
		
		Stu[] stus = new Stu[5];
		System.out.println(stus);
		
		stus[0] = new Stu("周瑜", 23, "男", "东吴");
		stus[1] = new Stu("小乔", 20, "女", "杭州");
		stus[2] = new Stu("黄盖", 23, "男", "东吴");
		stus[3] = new Stu("孙权", 33, "男", "杭州");
		stus[4] = new Stu("孙坚", 53, "男", "东吴");
		
		// 输出学生年龄大于23岁的名字
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].age > 23) {
				System.out.println("年龄大于23:" + stus[i].name);
			}
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].address.equals("杭州")) {
				stus[i].show();
			}
		}
		
	}
}

class Stu{
	// 属性
	String name;
	int age;
	String gender;
	String address;
	
	public Stu() {
		super();
	}

	public Stu(String name, int age, String gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	// 方法
	public void run(String func) {
		System.out.println("喜欢跑步运动:" + func);
	}
	
	public void eat(String food) {
		System.out.println(name + "喜欢吃" + food);
	}
	
	public void sleep() {
		System.out.println("睡觉是为了修复身体");
	}
	
	public void show() {
		System.out.println("Stu [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]");
	}
	
}

