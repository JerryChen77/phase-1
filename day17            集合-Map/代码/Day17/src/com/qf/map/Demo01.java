package com.qf.map;

import java.util.HashSet;

public class Demo01 {
	public static void main(String[] args) {
		// �Զ�����,��������ķ�ʽ�洢�û���Ϣ
		Employee employee = new Employee("", 23, "", "");
		
		/**
		 *  	����=
		 *  	����=
		 *  	��ַ=
		 *  	�绰=
		 *  
		 *  	Map	˫�м���
		 *  	key	value
		 *  	����	����
		 *  	����	23
		 */
		
		String[] info = {"","","",""};
		HashSet<String> set = new HashSet<String>();
		
		
	}
}

class Employee {
	String name;
	int age;
	String address;
	String phone;

	public Employee(String name, int age, String address, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phone + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
