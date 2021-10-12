import java.util.Scanner;
class Demo06 {
	public static void main(String[] args) {
		/*
			键盘录入3个数字,输出最大的

			代码思路
				1、导包
				2、创建键盘对象
				3、提示输入第一个数字
				4、获取输入的第一个数字
				... ...
				9、比较

		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字:");
		int a = sc.nextInt();
	
		System.out.println("请输入第二个数字:");
		int b = sc.nextInt();

		System.out.println("请输入第三个数字:");
		int c = sc.nextInt();

		// 获取a和b中较大的
		int max;
		max = a>b ? a:b;

		// 获取max和c中较大的
		max = max>c ? max:c;

		System.out.println("三个数字最大的是:" + max);

	}
}
