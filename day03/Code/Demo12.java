class Demo12 {
	public static void main(String[] args) {
		int a = 15;
		int b = 10;
		System.out.println("a + b = " + a + b);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));	// ���������
		System.out.println("a % b = " + (a % b));	// ȡ����֮�������
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
			ͳ������

			ͳ��֮ǰ
				80KG


			ʱ�䣺
				18:00
					�ȳԷ����ټ�¼����	81KG	++��ǰ
					�ȼ�¼���أ��ٳԷ�	80KG	++�ں�
			
			����
				19:00
				81KG
		*/
	}
}