package com.qf.serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 	对象序列化
 * @author Dushine2008
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Stu stu = new Stu("zhangsan", 23);
		/**
		 * 	使用流传输对象
		 */
		
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("stu_zhansan")));
			oos.writeObject(stu);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("OVER");
	}
}

class Stu implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 11321641216L;
	String name;
	int age;
	
	public Stu() {}

	public Stu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + "]";
	}
	
}
