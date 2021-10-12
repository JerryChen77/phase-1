package com.qf.poly;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 正常创建对象
		 * 	调用自己的属性和方法
		 */
		Worker w1 = new Worker();
		w1.work();
		System.out.println("type属性:" + w1.type);	// 工人
		System.out.println("=======================");
		
		/**
		 * 多态的创建对象方式
		 * 	可以调用父类的方法
		 */
		Worker w2 = new ZongziWorker();
		w2.work();
		System.out.println("type属性:" + w2.type);	// 粽子工
		System.out.println("=======================");
		
		/**
		 * 多态的创建对象方式
		 * 	可以调用父类的方法
		 * 	--如果子类重写了继承的方法，运行的是子类重写之后的方法
		 * 不能调用子类独有的方法
		 */
		Worker w3 = new MooncakeWorker();
		w3.work();
		System.out.println("type属性:" + w3.type);	// 月饼工
		
		// w3.eatMooncake();
	}
}

class Worker{
	String type = "工人";
	
	public void work() {
		System.out.println("工人做工");
	}
}

class ZongziWorker extends Worker{
	String type = "粽子工";
	
}

class MooncakeWorker extends Worker{
	String type = "月饼工";
	double salary = 6000;
	
	@Override
	public void work() {
		super.work();
		System.out.println("月饼工生产月饼");
	}
	
	public void eatMooncake() {
		System.out.println("月饼工人可以品尝月饼...");
	}
}
