import java.util.Scanner;
class  Test06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���ж���Ǯ��");
		int m = sc.nextInt();
		if(m>=200){
			System.out.println("�ƻ���");
		}else if(m>=100 && m<200){
			System.out.println("��Ѽ");	
		}else if(m>=60 && m<100){
			System.out.println("������");	
		}else if(m>=40 && m<60){
			System.out.println("С����");	
		}else if(m>=10 && m<40){
			System.out.println("��ˮ����");	
		}else if(m>=0 && m<10){
			System.out.println("���");
		}else{
			System.out.println("��������");
		}
	}
}
