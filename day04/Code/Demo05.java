import java.util.Scanner; //1������Scanner--����
class Demo05{
	public static void main(String[] args) {
		/*
			����¼�����������䡢��ַ����ע����Ϣ���ڿ���̨���
			
			����˼·
				1������Scanner--����
				2������Scanner����
				3����ʾ��������
				4����ȡ����
				5����ʾ��������
				6����ȡ����
				7����ʾ�����ַ
				8����ȡ��ַ
				9����ʾ���뱸ע
				10����ȡ��ע
				11�����������Ϣ
		*/

		// 2������Scanner����
		Scanner sc = new Scanner(System.in);

		// 3����ʾ��������
		// 4����ȡ����
		System.out.println("�������������:");
		String name = sc.next();

		// 5����ʾ��������
		// 6����ȡ����
		System.out.println("�������������:");
		int age = sc.nextInt();

		// 7����ʾ�����ַ
		// 8����ȡ��ַ
		System.out.println("��������ĵ�ַ:");
		String address = sc.next();

		// 9����ʾ���뱸ע
		// 10����ȡ��ע
		System.out.println("��������ı�ע��Ϣ:");
		String info = sc.next();

		System.out.println("����:" + name + ",����:" + age + ",����:" + address + ",��ע:" + info);

	}
}
