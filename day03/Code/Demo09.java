class Demo09 {
	public static void main(String[] args) {
		byte b = 110;	// b的类型是byte，空间是1字节
		int i = b;		// 把b放入i的空间，把1字节的内容放入4字节，安全
		System.out.println("int i = " + i);

		float f = i;	// 浮点型表示的数据要多于int
		System.out.println("float f = " + f);

		int j = (int)f;		// 小数取整会舍弃小数部分,会有数据损失
		// 指鹿为马
		System.out.println("int j = " + j);

		int x = 1234;
		byte b00 = (byte)x;
		System.out.println("byte b00 = " + b00);
	}
}
