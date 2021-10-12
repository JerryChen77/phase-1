package com.qf.exception;

public class Demo08 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "����";
		s.setWeight(2000);
		System.out.println(s);
	}
}

class Student {
	String name;
	private double weight;
	private double height;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight > 50 && weight <= 125) {
			this.weight = weight;
		} else {
			throw new WeightOutOfBoundsException("���س�����Χ by " + weight);
		}

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 140 && height <= 240) {
			this.height = height;
		} else {
			throw new HeightOutOfBoundsException("��߳�����Χ by " + height);
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
}

/**
 * 	�Զ����쳣
 * 	���س�����Χ�쳣
 * @param message
 */
class WeightOutOfBoundsException extends RuntimeException {

	public WeightOutOfBoundsException(String message) {
		super(message);

	}

}

/**
 * 	�Զ����쳣
 * 	��߳�����Χ�쳣
 * @param message
 */
class HeightOutOfBoundsException extends RuntimeException {

	public HeightOutOfBoundsException(String message) {
		super(message);
	}
	
}
