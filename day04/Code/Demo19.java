import java.util.Scanner;
class Demo19 {
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
				System.out.println("1���Ƕ���,�����Х...");
				//break;	// breakȱʧ�����case��͸
			case 2:
				System.out.println("2���Ƕ���,�����Х...");
				//break;
			case 12:
				System.out.println("12���Ƕ���,�����Х...");
				break;
			
			case 3:
				System.out.println(month + "���Ǵ���,��ů����...");
				break;
			case 4:
				System.out.println(month + "���Ǵ���,��ů����...");
				break;
			case 5:
				System.out.println(month + "���Ǵ���,��ů����...");
				break;

			// default���Է���switch�ṹ������λ�ã�һ�����ĩβ
			default:
				System.out.println(month + "�²�����");
				break;

			case 6:
				System.out.println(month + "�����Ľ�,��������...");
				break;
			case 7:
				System.out.println(month + "�����Ľ�,��������...");
				break;
			case 8:
				System.out.println(month + "�����Ľ�,��������...");
				break;

			case 9:
				System.out.println(month + "�������,�����ˬ...");
				break;
			case 10:
				System.out.println(month + "�������,�����ˬ...");
				break;
			case 11:
				System.out.println(month + "�������,�����ˬ...");
				break;
			
		}

		System.out.println("Hello World!");
	}
}
