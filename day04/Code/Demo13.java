import java.util.*;
class Demo13{
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

		// �ж�
		if(day == 1){
			System.out.println("����������һ,�γ�������,����,Ӱ�Ӽ���");
		} else if(day == 2){
			System.out.println("���������ڶ�,�γ�������,˼��Ʒ��");
		} else if(day == 2){
			System.out.println("���������ڶ�,�γ�������,˼��Ʒ��===");
		} else if(day == 2){
			System.out.println("���������ڶ�,�γ�������,˼��Ʒ��****");
		} else if(day == 3){
			System.out.println("������������,�γ����й�����ʷ,��ѧӢ��");
		} else if(day == 4){
			System.out.println("������������,�γ��иߵ���ѧ,C����");
		} else if(day == 5){
			System.out.println("������������,�γ���Python,���ݽṹ");
		} else if(day == 6){
			System.out.println("������������,�γ���CS");
		} else if(day == 7){
			System.out.println("������������,�γ���LOL");
		} else{
			System.out.println("���ڲ����ڡ�������������������������");
		}

		System.out.println("Hello World!");
	}
}
