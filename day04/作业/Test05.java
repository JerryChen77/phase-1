import java.util.Scanner;
class  Test05
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������x��ֵ");
		int x = sc.nextInt();
		System.out.println("������y��ֵ");
		int y = sc.nextInt();
		System.out.println("������z��ֵ");
		int z = sc.nextInt();
		int m = x>=y ? x : y;
		int max = m>z ? m : z;
		System.out.println("���ֵΪ"+ max);
	}
}
