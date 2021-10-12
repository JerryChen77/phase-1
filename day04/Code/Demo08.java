import java.util.Scanner;
class Demo08 {
	public static void main(String[] args) {
		/*
			键盘录入你的身高,如果大于162可以参与征兵
		*/

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入你的身高:");

		int height = sc.nextInt();

		if(height >= 162){
			System.out.println("欢迎参加征兵工作,请先填写个人信息:");
		}

		System.out.println("OVER");

	}
}
