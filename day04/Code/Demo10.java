import java.util.Scanner;
class Demo10 {
	public static void main(String[] args) {
		// ����¼�������εı߳������������ε��ܳ�
		/*
			����
				1������
				2������Scanner����
				3����ʾ�����һ���߳�
				4����ȡ��һ���߳�
				... ...
				9���ж��ܲ��ܹ��������Σ������ܳ�
		*/

		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ���߳�:");
		int a = sc.nextInt();

		System.out.println("������ڶ����߳�:");
		int b = sc.nextInt();

		System.out.println("������������߳�:");
		int c = sc.nextInt();

		// �ж��ܲ��ܹ���������
		if((a+b>c) && (a+c>b) && (b+c>a)){
			System.out.println("�ܳ���:" + (a+b+c));
		}else{
			System.out.println("�����������߳��޷�����������");
		}

		System.out.println("OVER");
	}
}
