import java.util.Scanner;
class  ShuiXianHua
{	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int num = sc.nextInt();
		int ge = num%10;
		int shi = num/10%10;
		int bai = num/100;
		if (num == ge*ge*ge + shi*shi*shi + bai*bai*bai){
			System.out.println("该数为水仙花数");
		}else{
                                            System.out.println("该数不是水仙花数");
                                      }
	}
}
