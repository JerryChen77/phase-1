package com.qf.static0;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	System.arraycopy(src, srcPos, dest, destPos, length);
			Math.random()
			Arrays.copyOf(original, newLength)
			
			new Random().nextInt(100)
		
		
		 * ��Щ��������ʹ������.��������
		 * 	�������������static����
		 * 
		 * ��Щ���������ȴ���������ʹ�ö������
		 */
		
	}
}

class Russians{
	String name;
	int age;
	static String capital = "Ī˹��";
	
	public Russians() {
		super();
	}

	public Russians(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("����˹С�ԣ����а͡�����˹�㳦������˹���ؼ�");
	}
	
	public void show() {
		System.out.println("Russians [name=" + name + ", age=" + age + ", capital=" + capital + "]");
		System.out.println(this);
	}
	
	public static void showStatic() {
		// ��̬�����в��ܵ��÷Ǿ�̬����
		// System.out.println("Russians [name=" + name + ", age=" + age + ", capital=" + capital + "]");
		// ��̬�����в��ܵ��÷Ǿ�̬����
		// show();
		// ��̬�����в���ʹ��this--��̬���ݼ���ʱ�����ڶ���
		// System.out.println(this);
	}
}
