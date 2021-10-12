class Demo03 {
	public static void main(String[] args) {
		String name = "张三";
		int age = 23;
		String msg = "法外狂徒";
		System.out.println("姓名:" + name);
		System.out.println("年龄:" + age);
		System.out.println("备注:" + msg);
		
		System.out.println("========================");

		System.out.print("姓名:" + name);
		System.out.print("，年龄:" + age);
		System.out.println("，备注:" + msg);

		System.out.println("========================");

		// 字符串拼接变量--最终都变成字符串--夹饼--大饼夹一切
		System.out.print("姓名:" + name + "，年龄:" + age + "，备注:" + msg);
		
	}
}
