import java.util.*;
class Demo18 {
	public static void main(String[] args) {
		/*
			����¼�����ڼ��������һ��Ŀγ�
			˼·
				1������
				2������Scanner����
				3����ʾ�������ڼ�--����
				4����ȡ�������
				5��������������γ�
		*/
		Scanner sc = new Scanner(System.in);

		System.out.println("��������Ҫ�����ڼ��Ŀγ�(1--7):");
		int day = sc.nextInt();

		switch(day){
			case 1:
				System.out.println("����������һ,�γ�������,����,Ӱ�Ӽ���");
				break;

			case 2:
				System.out.println("����������2,�γ�������,����,Ӱ�Ӽ���");
				break;

			case 3:
				System.out.println("����������3,�γ�������,����,Ӱ�Ӽ���");
				break;

			case 4:
				System.out.println("����������4,�γ�������,����,Ӱ�Ӽ���");
				break;

			case 5:
				System.out.println("����������5,�γ�������,����,Ӱ�Ӽ���");
				break;

			case 6:
				System.out.println("����������6,�γ�������,����,Ӱ�Ӽ���");
				break;

			case 7:
				System.out.println("����������7,�γ�������,����,Ӱ�Ӽ���");
				break;
			
			default:
				System.out.println("��������");
				break;
		}

		System.out.println("Hello World!");
	}
}
