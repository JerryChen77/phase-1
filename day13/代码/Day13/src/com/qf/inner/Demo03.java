package com.qf.inner;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 *	 ������Ա�ڲ������ķ�ʽ
		 * 		�ȴ����ⲿ�����
		 * 		�ڴ����ڲ������
		 */
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		System.out.println(inner.strInner);
		inner.show();
		
	}
}

class Outer{
	String strOut = "�ⲿ�����";
	private String strOutPri = "�ⲿ��˽�б���";
	static String strOutSta = "�ⲿ�ྲ̬����";
	int num = 110;
	
	class Inner{
		String strInner = "�ڲ������";
		private String strInnerPri = "�ڲ���˽�б���";
		// ��Ա�ڲ��಻��������̬����
		// static String strInnerSta = "�ڲ��ྲ̬����";
		int num = 220;
		
		public void show() {
			// �ڲ�����Է����ⲿ����������Ժͷ���
			System.out.println(strInner);
			System.out.println(strOut);
			System.out.println(strInnerPri);
			System.out.println(strOutPri);
			System.out.println(strOutSta);
			// �����ⲿ��ĳ�Ա����
			System.out.println(Outer.this.num);
		}
	}
	
}
