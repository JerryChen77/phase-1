import java.util.Scanner;
class  Noname1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		int num1 = sc.nextInt();
		System.out.println("������ڶ�����");
		int num2 = sc.nextInt();
		System.out.println("�������������");
		int num3 = sc.nextInt();
		int m = num1>num2 ? num1 : num2;
		int max = m>num3 ? m : num3;
		System.out.println("���ֵΪ"+max);
	}
}
