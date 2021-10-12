package com.qf.map;

import java.util.HashMap;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	向map中添加数据--映射
		 */
		HashMap<String, Stu> map = new HashMap<String, Stu>();
		map.put("宋江", new Stu("10001", "宋江", 23,"梁山好汉的头目,真正的法外狂徒..."));
		map.put("李逵", new Stu("10010", "李逵", 18,"梁山好汉头目的铁杆粉丝,杀虎狂人..."));
		map.put("鲁智深", new Stu("10020", "鲁智深", 20,"倒拔垂杨柳,一个人拆了一座庙..."));
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
