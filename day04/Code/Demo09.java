import java.util.Scanner;
class Demo09 {
	public static void main(String[] args) {
		/*
			ģ�⳵վ��Ʊ
				����г�Ʊ����ʾ��վ����
				���û�г�Ʊ����ʾȥ��Ʊ
			
			1������
			2���μӼ��̶���
			3����ʾ��ʾ��Ʊ
			4����ȡ��Ʊ��Ϣ(��==1����==0)
			5���ж��Ƿ��ܽ�վ
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("���ʾ��Ʊ(��Ʊ==1,��Ʊ==0)��");

		int ticket = sc.nextInt();

		// �ж�
		if(ticket>0){
			System.out.println("��Ʊͨ��,���ŶӰ���...");
		} else{
			System.out.println("����ȥ����Ʊ...");
		}

		System.out.println("OVER");
		/*
		153
			1	1*1*1=1
			5	5*5*5=125
			3	3*3*3=27
		*/
	}
}
