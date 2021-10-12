import java.util.Scanner;
class Demo10 {
	public static void main(String[] args) {
		// 键盘录入三角形的边长，计算三角形的周长
		/*
			分析
				1、导包
				2、创建Scanner对象
				3、提示输入第一条边长
				4、获取第一条边长
				... ...
				9、判断能不能构成三角形，计算周长
		*/

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一条边长:");
		int a = sc.nextInt();

		System.out.println("请输入第二条边长:");
		int b = sc.nextInt();

		System.out.println("请输入第三条边长:");
		int c = sc.nextInt();

		// 判断能不能构成三角形
		if((a+b>c) && (a+c>b) && (b+c>a)){
			System.out.println("周长是:" + (a+b+c));
		}else{
			System.out.println("您输入三条边长无法构成三角形");
		}

		System.out.println("OVER");
	}
}
