package com.qf.map;

import java.util.HashMap;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	��map���������--ӳ��
		 */
		HashMap<String, Stu> map = new HashMap<String, Stu>();
		map.put("�ν�", new Stu("10001", "�ν�", 23,"��ɽ�ú���ͷĿ,�����ķ����ͽ..."));
		map.put("����", new Stu("10010", "����", 18,"��ɽ�ú�ͷĿ�����˷�˿,ɱ������..."));
		map.put("³����", new Stu("10020", "³����", 20,"���δ�����,һ���˲���һ����..."));
		System.out.println(map);
		
		HashMap<String, Stu> stus = new HashMap<String, Stu>(map);
		System.out.println(stus);
	}
}

class Stu {
	String id;
	String name;
	int age;
	String info;

	public Stu(String id, String name, int age, String info) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.info = info;
	}

	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", age=" + age + ", info=" + info + "]";
	}

}
