import java.util.Scanner;	// 1、导入Scanner这个类
class Demo04 {
	public static void main(String[] args) {
		/*
			键盘录入一个数字,判断是不是偶数、

			1、导入Scanner这个类
			2、创建Scanner对象
			3、提示用户输入数字
			4、获取用户输入的数字
			5、判断数字输出结果
		*/

		int a = 10;
		// 2、创建Scanner对象
		Scanner sc = new Scanner(System.in);
		
		// 3、提示用户输入数字
		System.out.println("请输入一个整数:");

		// 4、获取用户输入的数字
		int num = sc.nextInt();

		// 5、判断数字输出结果
		String result = num%2==0 ? "偶数" : "奇数";
		System.out.println("您输入这个整数是" + result);

	}
}
