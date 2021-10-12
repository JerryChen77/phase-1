package com.qf.inner;

public class Demo08 {
	public static void main(String[] args) {
		// 匿名内部类
		new Computer0() {
			@Override
			void playGame() {
				System.out.println("玩大型游戏");
			}
		}.playGame();
		
		Computer0 computer0 = new Computer0() {
			@Override
			void playGame() {
				System.out.println("玩大型游戏");
			}
		};
		
		computer0.playGame();
	}
}
