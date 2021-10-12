import java.util.Scanner;
class  Test05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入x的值");
		int x = sc.nextInt();
		System.out.println("请输入y的值");
		int y = sc.nextInt();
		System.out.println("请输入z的值");
		int z = sc.nextInt();
		int m = x>=y ? x : y;
		int max = m>z ? m : z;
		System.out.println("最大值为"+ max);
	}
}
