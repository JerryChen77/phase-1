class Demo04 {
	public static void main(String[] args) {
		byte b = 110;
		System.out.println("byte b = " + b);

		short s = 32767;
		System.out.println("short s = " + s);

		int i = 2147483647;
		System.out.println("int i = " + i);

		// java������Ĭ�ϵ�������int,�ڸ�long�������ݸ�ֵ��ʱ��������ݳ�����int�ķ�Χ����Ҫ����L
		long l = 21474836470L;
		System.out.println("long l = " + l);
		/*
			1TB = 1000GB 
			= 1000 * 1000MB
			= 1000 * 1000 * 1000KB 
			= 1000 * 1000 * 1000 * 1000B
		*/
	}
}
