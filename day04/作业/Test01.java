import java.util.Scanner;
class Test01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ�");
		int num = sc.nextInt();
		System.out.println("�������Ա�(����1��Ů��0)");
		int sex = sc.nextInt();
		if (num > 90)
		{
			if(sex ==1){
				System.out.println("����һ����ԫ����");
			}else if(sex == 0){
				System.out.println("����һ��������");
			}else{
				System.out.println("�Ա����");
			}
		}else{
			System.out.println("�ɼ�̫�");
	         }
     }
}
