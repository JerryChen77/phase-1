package com.qf.ChenJIngLun.exam04;

public class exam03 {

	public static void main(String[] args) {
		Ticket1  t1 = new Ticket1 ();
		Ticket1  t2 = new Ticket1 ();
		Ticket1  t3 = new Ticket1 ();
		Ticket1  t4 = new Ticket1 ();
		t1.setName("1号窗口");
		t2.setName("2号窗口");
		t3.setName("3号窗口");
		t4.setName("4号窗口");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(Ticket1.class);
	}

}
class Ticket1 extends Thread{
	static int ticket = 100;
	public void run() {
			while(true) {
				synchronized (Object.class) {
				if(ticket <=0) {
					break;
				}
				ticket--;
				System.out.println(Thread.currentThread().getName()+"卖出了第"+(100-ticket)+"张票\t还剩"+ticket);
			}
		}	
	}
}
