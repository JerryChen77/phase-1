class Demo01 {
	public static void main(String[] args) {
		// ������������a��b�����������������������a��b��ֵ
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
