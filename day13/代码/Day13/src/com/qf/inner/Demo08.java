package com.qf.inner;

public class Demo08 {
	public static void main(String[] args) {
		// �����ڲ���
		new Computer0() {
			@Override
			void playGame() {
				System.out.println("�������Ϸ");
			}
		}.playGame();
		
		Computer0 computer0 = new Computer0() {
			@Override
			void playGame() {
				System.out.println("�������Ϸ");
			}
		};
		
		computer0.playGame();
	}
}
