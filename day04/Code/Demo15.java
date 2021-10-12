import java.util.Scanner;
class Demo15 {
	public static void main(String[] args) {
		/*
			模拟乘坐火车

				检票
					有票
						安检
							通过
								排队候车
							未通过
								带走

					无票
						提示去买票
				
		*/
		Scanner sc = new Scanner(System.in);
		
		// 检票环节
		System.out.println("请出示车票(有票==1,无票==0):");
		int ticket = sc.nextInt();

		// 判断车票
		if(ticket==1){
			System.out.println("检票通过,请进站安检");
			// 安检环节
			System.out.println("您的刀具长度是多多少(mm):");
			int length = sc.nextInt();

			// 判断
			if(length > 150){
				// 管制刀具
				System.out.println("你携带了管制刀具,请跟我走一趟...");
			} else{
				System.out.println("安检通过,请排队候车...");
			}

		} else{
			System.out.println("请先去购买车票...");
		}
	}
}
