package com.qf.inner;

public class Demo04 {
	public static void main(String[] args) {
		// ��̬�ڲ������Ĵ������������ⲿ�����
		System.out.println(Outer00.Inner00.strInnerSta);
		
		Outer00.Inner00 inner00 = new Outer00.Inner00();
		
	}
}


class Outer00{
	String strOut = "�ⲿ�����";
	private String strOutPri = "�ⲿ��˽�б���";
	static String strOutSta = "�ⲿ�ྲ̬����";
	int num = 110;
	
	static class Inner00{
		String strInner = "�ڲ������";
		private String strInnerPri = "�ڲ���˽�б���";
		// ��̬�ڲ�����������̬����
		static String strInnerSta = "�ڲ��ྲ̬����";
		int num = 220;
		
		public void show() {
			// ��̬�ڲ�����Է����ⲿ�ྲ̬���Ժͷ���
			System.out.println(strInner);
			// ��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬����
			// System.out.println(strOut);
			System.out.println(strInnerPri);
			// System.out.println(strOutPri);
			System.out.println(strOutSta);
			// ���ܵ����ⲿ��ĳ�Ա����
			// System.out.println(Outer.this.num);
		}
	}
}