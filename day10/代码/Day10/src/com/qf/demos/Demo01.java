package com.qf.demos;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	��дѧ����
				����
					name
					age
					sex
					address
				����
					run
					eat
					sleep
				
			������ѧ,��Ҫ¼��5��ѧ����Ϣ, ��д����, ¼������ϵͳ,����дѧ����������
				��������Ǵ���23���ѧ��������
				�����ַ�ں��ݵ�ѧ����������Ϣ
		 */
		
		int[] arr = {11,22,33};
		String[] arrr = {"","",""};
		
		Stu[] stus = new Stu[5];
		System.out.println(stus);
		
		stus[0] = new Stu("���", 23, "��", "����");
		stus[1] = new Stu("С��", 20, "Ů", "����");
		stus[2] = new Stu("�Ƹ�", 23, "��", "����");
		stus[3] = new Stu("��Ȩ", 33, "��", "����");
		stus[4] = new Stu("���", 53, "��", "����");
		
		// ���ѧ���������23�������
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].age > 23) {
				System.out.println("�������23:" + stus[i].name);
			}
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].address.equals("����")) {
				stus[i].show();
			}
		}
		
	}
}

class Stu{
	// ����
	String name;
	int age;
	String gender;
	String address;
	
	public Stu() {
		super();
	}

	public Stu(String name, int age, String gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	// ����
	public void run(String func) {
		System.out.println("ϲ���ܲ��˶�:" + func);
	}
	
	public void eat(String food) {
		System.out.println(name + "ϲ����" + food);
	}
	
	public void sleep() {
		System.out.println("˯����Ϊ���޸�����");
	}
	
	public void show() {
		System.out.println("Stu [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]");
	}
	
}

