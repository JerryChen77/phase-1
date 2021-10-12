package com.qf.lambda;

import java.util.function.Consumer;

public class Demo05 {
	public static void main(String[] args) {
		Consumer<Integer> c1 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("周末出去happy一下,预算:" + t);
			}
		};
		c1.accept(200);
		
		Consumer<Integer> c2 = t -> System.out.println("周末出去happy一下,预算:" + t);
		c2.accept(210);
		
		play(c1, 230);
		
		play(t -> System.out.println("周末出去happy一下,预算:" + t), 330);
		
	}
	
	/**
	 * 	消费型接口
	 * @param consumer
	 * @param money
	 */
	public static void play(Consumer<Integer> consumer,Integer money) {
		consumer.accept(money);
	}
	
}
