package com.qf.extend;

public class Demo03 {
	public static void main(String[] args) {
		JavaProgrammer jp = new JavaProgrammer();
		jp.work();
	}
}

class Worker{
	String name;
	int age;
	
	public void work() {
		System.out.println("每天努力工作");
	}
}

/**
 * 	子类继承Worker
 */
class JavaProgrammer extends Worker{
	/**
	 * 	覆盖继承的方法
	 * 	重写--Override
	 */
	public void work() {
		System.out.println("java程序员每天写代码、制造bug、解决bug,和产品经理展开自由搏击");
	}
}
