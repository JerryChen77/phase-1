import java.util.Scanner; //1、导入Scanner--键盘
class Demo05{
	public static void main(String[] args) {
		/*
			键盘录入姓名、年龄、地址、备注等信息，在控制台输出
			
			代码思路
				1、导入Scanner--键盘
				2、创建Scanner对象
				3、提示输入姓名
				4、获取姓名
				5、提示输入年龄
				6、获取年龄
				7、提示输入地址
				8、获取地址
				9、提示输入备注
				10、获取备注
				11、输出以上信息
		*/

		// 2、创建Scanner对象
		Scanner sc = new Scanner(System.in);

		// 3、提示输入姓名
		// 4、获取姓名
		System.out.println("请输入你的名字:");
		String name = sc.next();

		// 5、提示输入年龄
		// 6、获取年龄
		System.out.println("请输入你的年龄:");
		int age = sc.nextInt();

		// 7、提示输入地址
		// 8、获取地址
		System.out.println("请输入你的地址:");
		String address = sc.next();

		// 9、提示输入备注
		// 10、获取备注
		System.out.println("请输入你的备注信息:");
		String info = sc.next();

		System.out.println("我是:" + name + ",今年:" + age + ",来自:" + address + ",备注:" + info);

	}
}
