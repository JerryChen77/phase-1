package com.qf.exam;

public class Demo05 {
	public static void main(String[] args) {
		
		// 创建Worker对象并放入数组--4分
		Worker[] workers = new Worker[5];
		Worker worker01 = new Worker("zhangsan", 10000);
		Worker worker02 = new Worker("zhangsi", 20000);
		Worker worker03 = new Worker("zhangwu", 30000);
		Worker worker04 = new Worker("zhangliu", 40000);
		Worker worker05 = new Worker("zhangqi", 50000);
		workers[0] = worker01;
		workers[1] = worker02;
		workers[2] = worker03;
		workers[3] = worker04;
		workers[4] = worker05;
		
		// 计算平均工资--3分
		double sum = 0;
		
		for (int i = 0; i < workers.length; i++) {
			sum += workers[i].getSalary();
		}
		System.out.println(sum/workers.length);
	}
}

/**
 * Worker类--3分
 * @author Dushine2008
 *
 */
class Worker{
	String name;
	private double salary;
	
	public Worker() {
		super();
	}

	public Worker(String name, double salary) {
		super();
		this.name = name;
		this.setSalary(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}else {
			System.out.println("工资金额输入有误");
		}
	}
}