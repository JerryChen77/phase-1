import java.util.Scanner;
class Demo14 {
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

		// 判断
		if(month==3 || month==4 || month==5){
			System.out.println(month + "月是春节,春暖花开...");
		} else if(month==6 || month==7 || month==8){
			System.out.println(month + "月是夏节,烈日炎炎...");
		} else if(month==9 || month==10 || month==11){
			System.out.println(month + "月是秋节,秋高气爽...");
		} else if(month==12 || month==1 || month==2){
			System.out.println(month + "月是冬节,北风呼啸...");
		} else{
			System.out.println(month + "月不存在");
		}

		System.out.println("OVER");
	}
}
