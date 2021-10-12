import java.util.Scanner;
class Demo09 {
	public static void main(String[] args) {
		/*
			模拟车站检票
				如果有车票，提示进站安检
				如果没有车票，提示去买票
			
			1、导包
			2、参加键盘对象
			3、提示出示车票
			4、获取车票信息(有==1，无==0)
			5、判断是否能进站
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请出示车票(有票==1,无票==0)：");

		int ticket = sc.nextInt();

		// 判断
		if(ticket>0){
			System.out.println("检票通过,请排队安检...");
		} else{
			System.out.println("请先去购买车票...");
		}

		System.out.println("OVER");
		/*
		153
			1	1*1*1=1
			5	5*5*5=125
			3	3*3*3=27
		*/
	}
}
