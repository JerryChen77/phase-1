import java.util.Scanner;
class Demo17 {
	public static void main(String[] args) {
		// ����¼���ȵ�λ,���ת��

		/*
			1������
			2����������
			3����ʾ����
			4����ȡ����
			5���ж����
		*/
		Scanner sc = new Scanner(System.in);

		System.out.println("��������ȵĵ�λ(0--3):");
		int level = sc.nextInt();

		switch(level){
			case 0:
				// level==0
				System.out.println("���ڵĵ�λ��0,���ȴ���ֹͣ״̬...");
				break;

			case 1:	// ��ͬ��if(level==1)
				// level==1
				System.out.println("���ڵĵ�λ��1,����ת�ٽ���...");
				break;

			case 2:
				// level==2
				System.out.println("���ڵĵ�λ��2,����ת������...");
				break;
			
			case 3:
				// level==3
				System.out.println("���ڵĵ�λ��3,����ת�ٺܿ�...");
				break;
			
			default:
				// levelû�к���������caseƥ�䵽
				System.out.println("��λ������");
				break;
		}
	}
}
