package com.qf.exception;

public class Demo08 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "张三";
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
			throw new WeightOutOfBoundsException("体重超出范围 by " + weight);
		}

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 140 && height <= 240) {
			this.height = height;
		} else {
			throw new HeightOutOfBoundsException("身高超出范围 by " + height);
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
}

/**
 * 	自定义异常
 * 	体重超出范围异常
 * @param message
 */
class WeightOutOfBoundsException extends RuntimeException {

	public WeightOutOfBoundsException(String message) {
		super(message);

	}

}

/**
 * 	自定义异常
 * 	身高超出范围异常
 * @param message
 */
class HeightOutOfBoundsException extends RuntimeException {

	public HeightOutOfBoundsException(String message) {
		super(message);
	}
	
}
