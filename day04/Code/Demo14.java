import java.util.Scanner;
class Demo14 {
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

		// �ж�
		if(month==3 || month==4 || month==5){
			System.out.println(month + "���Ǵ���,��ů����...");
		} else if(month==6 || month==7 || month==8){
			System.out.println(month + "�����Ľ�,��������...");
		} else if(month==9 || month==10 || month==11){
			System.out.println(month + "�������,�����ˬ...");
		} else if(month==12 || month==1 || month==2){
			System.out.println(month + "���Ƕ���,�����Х...");
		} else{
			System.out.println(month + "�²�����");
		}

		System.out.println("OVER");
	}
}
