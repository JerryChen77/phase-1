package com.qf.ChenJIngLun.exam04;

public class exam03 {

	public static void main(String[] args) {
		Ticket1  t1 = new Ticket1 ();
		Ticket1  t2 = new Ticket1 ();
		Ticket1  t3 = new Ticket1 ();
		Ticket1  t4 = new Ticket1 ();
		t1.setName("1�Ŵ���");
		t2.setName("2�Ŵ���");
		t3.setName("3�Ŵ���");
		t4.setName("4�Ŵ���");
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
				System.out.println(Thread.currentThread().getName()+"�����˵�"+(100-ticket)+"��Ʊ\t��ʣ"+ticket);
			}
		}	
	}
}
