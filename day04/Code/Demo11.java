import java.util.Scanner;
class Demo11 {
	public static void main(String[] args) {
		// 键盘录入一个三位数整数，判断是不是水仙花数字

		/*
			1、导包
			2、创建Scanner对象
			3、提示输入一个3位整数数字
			4、获取这个数字
			5、把数字拆分为个位、十位、百位
			6、获取各位数字的立方和
			7、判断是不是水仙花数字
			8、输出结果
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数整数:");

		int num = sc.nextInt();

		// 5、把数字拆分为个位、十位、百位
		/*
			153  --- 
				百位
					153/100
				十位
					153/10%10
				个位
					153%10
		*/
		int g = num%10;
		int s = num/10%10;
		int b = num/100;

		int sum = g*g*g + s*s*s + b*b*b;

		// 7、判断是不是水仙花数字
		if(sum == num){
			System.out.println(num + "是一个水仙花数字...");
		}else{
			System.out.println(num + "NO是一个水仙花数字...");
		}
		System.out.println("OVER");
	}
}
