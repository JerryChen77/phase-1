class Demo01 {
	public static void main(String[] args) {
		// 定义两个数字a和b，不引入第三个变量，交换a和b的值
		int a = 10;
		int b = 15;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = 10;
		b = 15;

		a = a + b;	// a=25,b=15
		b = a - b;	// a=25,b=10
		a = a - b;	// a=15,b=10
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = 10;
		b = 15;
		a = a - b;	//a=-5,b=15
		b = a + b;	//a=-5,b=10
		a = b - a;	//a=15,b=10

	}
}
