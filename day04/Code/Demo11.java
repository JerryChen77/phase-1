import java.util.Scanner;
class Demo11 {
	public static void main(String[] args) {
		// ����¼��һ����λ���������ж��ǲ���ˮ�ɻ�����

		/*
			1������
			2������Scanner����
			3����ʾ����һ��3λ��������
			4����ȡ�������
			5�������ֲ��Ϊ��λ��ʮλ����λ
			6����ȡ��λ���ֵ�������
			7���ж��ǲ���ˮ�ɻ�����
			8��������
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ������:");

		int num = sc.nextInt();

		// 5�������ֲ��Ϊ��λ��ʮλ����λ
		/*
			153  --- 
				��λ
					153/100
				ʮλ
					153/10%10
				��λ
					153%10
		*/
		int g = num%10;
		int s = num/10%10;
		int b = num/100;

		int sum = g*g*g + s*s*s + b*b*b;

		// 7���ж��ǲ���ˮ�ɻ�����
		if(sum == num){
			System.out.println(num + "��һ��ˮ�ɻ�����...");
		}else{
			System.out.println(num + "NO��һ��ˮ�ɻ�����...");
		}
		System.out.println("OVER");
	}
}
