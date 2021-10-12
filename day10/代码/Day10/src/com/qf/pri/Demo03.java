package com.qf.pri;

public class Demo03 {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "����";
		car.model = "��";
		car.info = "��Ƥ�������ʮ�ﴺ��֮�£������й�Ƥ�����û�ʱ���ĳ������Ե�����ҫ��";
		car.setPrice(120000);
		
		car.show();
		
		// �ƹ���˽�е��趨����
		car = new Car("����", "����", -20000, "���ò�˵,�������������ʦ����ǡ��Զ��󿪡�,��Ȼ�ܹ�ֱ�Ӹ��³�����Ϊ��������,���Դ�����ͻ���˺ܸߵ��ع��,����ȫ������ƽ̨����,��������ô�����ʡ�,");
		car.show();
	}
}

class Car{
	String brand;
	String model;
	private int price;
	String info;
	
	public Car() {}
	
	public Car(String brand, String model, int price, String info) {
		super();
		this.brand = brand;
		this.model = model;
		this.setPrice(price);
		this.info = info;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if (price >= 100000 && price < 170000) {
			this.price = price;
		}else {
			this.price = -1;
			System.err.println("�۸��ںϷ���Χ");
		}
	}
	
	public void show() {
		System.out.println("����һ̨" + brand + "�Ƶ�" + model + "��,�۸���:" + price + "," + info); 
	}
	
}
