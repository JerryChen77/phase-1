import java.util.*;
class Demo13{
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

		// 判断
		if(day == 1){
			System.out.println("今天是星期一,课程有体育,艺术,影视鉴赏");
		} else if(day == 2){
			System.out.println("今天是星期二,课程有语文,思想品德");
		} else if(day == 2){
			System.out.println("今天是星期二,课程有语文,思想品德===");
		} else if(day == 2){
			System.out.println("今天是星期二,课程有语文,思想品德****");
		} else if(day == 3){
			System.out.println("今天是星期三,课程有中国近代史,大学英语");
		} else if(day == 4){
			System.out.println("今天是星期四,课程有高等数学,C语言");
		} else if(day == 5){
			System.out.println("今天是星期五,课程有Python,数据结构");
		} else if(day == 6){
			System.out.println("今天是星期六,课程有CS");
		} else if(day == 7){
			System.out.println("今天是星期日,课程有LOL");
		} else{
			System.out.println("日期不存在。。。。。。。。。。。。。");
		}

		System.out.println("Hello World!");
	}
}
