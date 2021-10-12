import java.util.Scanner;
class Demo20 {
	public static void main(String[] args) {
		// 键盘录入月份，输出这个月份对应的季节和季节特征

		/*
			1、导包
			2、创建对象
			3、提示输入
			4、获取数据
			5、判断输出
		*/
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入你喜欢的月份:");
		int month = sc.nextInt();

		switch(month){
			case 1:	
			case 2:
			case 12:
				System.out.println(month + "月是冬节,北风呼啸...");
				break;
			
			case 3:
			case 4:
			case 5:
				System.out.println(month + "月是春节,春暖花开...");
				break;

			case 6:
			case 7:
			case 8:
				System.out.println(month + "月是夏节,烈日炎炎...");
				break;

			case 9:
			case 10:
			case 11:
				System.out.println(month + "月是秋节,秋高气爽...");
				break;

			default:
				System.out.println(month + "月不存在");
				break;
		}

		System.out.println("Hello World!");
	}
}

