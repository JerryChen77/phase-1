import java.util.Scanner;	// 1������Scanner�����
class Demo04 {
	public static void main(String[] args) {
		/*
			����¼��һ������,�ж��ǲ���ż����

			1������Scanner�����
			2������Scanner����
			3����ʾ�û���������
			4����ȡ�û����������
			5���ж�����������
		*/

		int a = 10;
		// 2������Scanner����
		Scanner sc = new Scanner(System.in);
		
		// 3����ʾ�û���������
		System.out.println("������һ������:");

		// 4����ȡ�û����������
		int num = sc.nextInt();

		// 5���ж�����������
		String result = num%2==0 ? "ż��" : "����";
		System.out.println("���������������" + result);

	}
}
