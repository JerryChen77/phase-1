package com.qf.pri;

public class Demo01 {
	public static void main(String[] args) {
		Stu s1 = new Stu();
		s1.name = "����";
		s1.age = 23;
		s1.show();
		
		System.out.println("===============");
		
		Stu s2 = new Stu();
		s2.name = "����";
		// ԭ���ǿ��Ա������ȡ���޸�,��취������,ֻ���ض��ķ�ʽ���޸�
		s2.age = 2;
		s2.show();
		
	}
}

class Stu{
	// ����
	String name;
	int age;
	
	public void show() {
		System.out.println("����" + name + ",����" + age);
	}
}
