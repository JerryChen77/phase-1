import java.util.Scanner;
class Demo06 {
	public static void main(String[] args) {
		/*
			����¼��3������,�������

			����˼·
				1������
				2���������̶���
				3����ʾ�����һ������
				4����ȡ����ĵ�һ������
				... ...
				9���Ƚ�

		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = sc.nextInt();
	
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();

		System.out.println("���������������:");
		int c = sc.nextInt();

		// ��ȡa��b�нϴ��
		int max;
		max = a>b ? a:b;

		// ��ȡmax��c�нϴ��
		max = max>c ? max:c;

		System.out.println("��������������:" + max);

	}
}
