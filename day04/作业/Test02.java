import java.util.Scanner;
class Test02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ƿ����������ϵģ�������1��û����0��");
		int num = sc.nextInt();
		if (num ==1){
			System.out.println("��һ������");
		}else if(num == 0){
			System.out.println("û���������ϵ�");
	    }else{
			System.out.println("��������");
		}
     }
}
