import java.util.*;
class Demo18 {
	public static void main(String[] args) {
		/*
			键盘录入星期几，输出这一天的课程
			思路
				1、导包
				2、创建Scanner对象
				3、提示输入星期几--整数
				4、获取这个日期
				5、根据日期输出课程
		*/
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入你要查星期几的课程(1--7):");
		int day = sc.nextInt();

		switch(day){
			case 1:
				System.out.println("今天是星期一,课程有体育,艺术,影视鉴赏");
				break;

			case 2:
				System.out.println("今天是星期2,课程有体育,艺术,影视鉴赏");
				break;

			case 3:
				System.out.println("今天是星期3,课程有体育,艺术,影视鉴赏");
				break;

			case 4:
				System.out.println("今天是星期4,课程有体育,艺术,影视鉴赏");
				break;

			case 5:
				System.out.println("今天是星期5,课程有体育,艺术,影视鉴赏");
				break;

			case 6:
				System.out.println("今天是星期6,课程有体育,艺术,影视鉴赏");
				break;

			case 7:
				System.out.println("今天是星期7,课程有体育,艺术,影视鉴赏");
				break;
			
			default:
				System.out.println("日期有误");
				break;
		}

		System.out.println("Hello World!");
	}
}
