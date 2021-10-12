class Demo12 {
	public static void main(String[] args) {
		int a = 15;
		int b = 10;
		System.out.println("a + b = " + a + b);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));	// 结果是整数
		System.out.println("a % b = " + (a % b));	// 取整数之后的余数
		System.out.println(10.0 / 3);

		/**
			++
			--
		*/
		a++;
		System.out.println("a = " + a);

		a++;
		System.out.println("a = " + a);

		a++;
		System.out.println("a = " + a);

		a++;
		System.out.println("a = " + a);

		a++;
		System.out.println("a = " + a);

		int i = b++;

		/*
			i = b
			b = b + 1
		*/

		System.out.println("b = " + b);
		System.out.println("i = " + i);

		a = 20;
		int j = ++a;
		/*
			a = a + 1
			j = a
		*/
		System.out.println("a = " + a);
		System.out.println("j = " + j);

		/*
			统计体重

			统计之前
				80KG


			时间：
				18:00
					先吃饭，再记录体重	81KG	++在前
					先记录体重，再吃饭	80KG	++在后
			
			晚上
				19:00
				81KG
		*/
	}
}