package com.qf.extend;

public class Demo05 {
	public static void main(String[] args) {
		S s = new S();
		System.out.println(s.name);
		System.out.println(s.age);
		// ˽�е����������޷�����
		// System.out.println(s.secret);
		
		s.show();
		// �����޷����ʸ�����˽�еķ���
		// s.showSecret();
		
		/**
		 * 	������û�м̳е�������˽�е�����
		 */
	}
}


class F{
	String name = "F";
	int age = 70;
	private String secret = "���кܶ�С����";
	
	public void show() {
		System.out.println("����F�е�show����");
	}
	
	private void showSecret() {
		System.out.println("���кܶ�С���ܾͲ�������");
	}
	
}

class S extends F{
	
}