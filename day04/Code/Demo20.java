import java.util.Scanner;
class Demo20 {
	public static void main(String[] args) {
		// ����¼���·ݣ��������·ݶ�Ӧ�ļ��ںͼ�������

		/*
			1������
			2����������
			3����ʾ����
			4����ȡ����
			5���ж����
		*/
		Scanner sc = new Scanner(System.in);

		System.out.println("��������ϲ�����·�:");
		int month = sc.nextInt();

		switch(month){
			case 1:	
			case 2:
			case 12:
				System.out.println(month + "���Ƕ���,�����Х...");
				break;
			
			case 3:
			case 4:
			case 5:
				System.out.println(month + "���Ǵ���,��ů����...");
				break;

			case 6:
			case 7:
			case 8:
				System.out.println(month + "�����Ľ�,��������...");
				break;

			case 9:
			case 10:
			case 11:
				System.out.println(month + "�������,�����ˬ...");
				break;

			default:
				System.out.println(month + "�²�����");
				break;
		}

		System.out.println("Hello World!");
	}
}

