import java.util.Scanner;
class Demo15 {
	public static void main(String[] args) {
		/*
			ģ�������

				��Ʊ
					��Ʊ
						����
							ͨ��
								�ŶӺ�
							δͨ��
								����

					��Ʊ
						��ʾȥ��Ʊ
				
		*/
		Scanner sc = new Scanner(System.in);
		
		// ��Ʊ����
		System.out.println("���ʾ��Ʊ(��Ʊ==1,��Ʊ==0):");
		int ticket = sc.nextInt();

		// �жϳ�Ʊ
		if(ticket==1){
			System.out.println("��Ʊͨ��,���վ����");
			// ���컷��
			System.out.println("���ĵ��߳����Ƕ����(mm):");
			int length = sc.nextInt();

			// �ж�
			if(length > 150){
				// ���Ƶ���
				System.out.println("��Я���˹��Ƶ���,�������һ��...");
			} else{
				System.out.println("����ͨ��,���ŶӺ�...");
			}

		} else{
			System.out.println("����ȥ����Ʊ...");
		}
	}
}
